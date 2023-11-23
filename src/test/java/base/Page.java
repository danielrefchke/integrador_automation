package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

/**
 * La clase Page es una clase Java que representa una página web y proporciona
 * métodos para interactuar
 * con los elementos de la página.
 * 
 * @author Daniel Refchke
 */
public class Page {
    protected WebDriver driver;

    /**
     * Constructor, inicializa todos los elementos
     * que usen anotaciones @FindBy y relacionadas
     * y tambien las que usen @DynBy
     */
    public Page() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);

        try {
            initDynamics(this);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * La función devuelve la URL actual de la página web a la que accede el
     * controlador.
     * 
     * @return El método devuelve la URL actual de la página web a la que accede el
     *         controlador.
     */
    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

    /**
     * La función devuelve un objeto WebElement para un elemento ubicado
     * dinámicamente utilizando un
     * localizador By determinado.
     * 
     * @param element El parámetro "elemento" es de tipo "Por", que es una clase en
     *                Selenium WebDriver
     *                que se utiliza para ubicar elementos en una página web. Se
     *                puede utilizar para buscar elementos
     *                mediante varios localizadores, como ID, nombre, nombre de
     *                clase, nombre de etiqueta, texto de
     *                enlace, texto de enlace parcial, selector de CSS,
     * @return El método devuelve un WebElement.
     */
    public WebElement getDynamicElement(By element) {
        DynamicElement dynamicElement = new DynamicElement(element);

        return dynamicElement.getWebElement();

    }

    // procesar anotaciones de campos dyn

    /**
     * La función "initDynamics" inicializa elementos dinámicos para una instancia
     * de objeto
     * determinada.
     * 
     * @param instancia El parámetro "instancia" es un objeto que representa una
     *                  instancia de una
     *                  clase anotada con @DynBy
     */
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