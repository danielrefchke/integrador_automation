package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

public class Page {
    protected WebDriver driver;

    public Page() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);

        try {
            initDynamics(this);

        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

    public WebElement getDynamicElement(By element) {
        DynamicElement dynamicElement = new DynamicElement(element);

        return dynamicElement.getWebElement();

    }

    // procesar anotaciones de campos dyn

    public static void initDynamics(Object instancia) throws IllegalAccessException {
        initializeDynElements(instancia);
    }

    private static void initializeDynElements(Object instancia) throws IllegalAccessException {
        for (Field field : instancia.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(DynBy.class)) {
                DynBy anotacionCampo = field.getAnnotation(DynBy.class);
                field.setAccessible(true);

                By by = null;

                if (!anotacionCampo.id().equals("")) {
                    by = By.id(anotacionCampo.id());
                }

                if (!anotacionCampo.name().equals("")) {
                    by = By.name(anotacionCampo.name());
                }

                if (!anotacionCampo.xpath().equals("")) {
                    by = By.xpath(anotacionCampo.xpath());
                }

                if (!anotacionCampo.className().equals("")) {
                    by = By.className(anotacionCampo.className());
                }

                DynamicElement dynamicElement = new DynamicElement(by);
                field.set(instancia, dynamicElement);
            }
        }
    }

}