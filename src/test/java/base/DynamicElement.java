package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

/**
 * La clase DynamicElement representa un elemento dinámico en una página web y
 * proporciona métodos para
 * esperar su presencia y visibilidad antes de devolver el WebElement
 * correspondiente.
 * 
 * @author Daniel Refchke
 */
public class DynamicElement {
    protected By elementBy;
    protected Wait<WebDriver> wait;

    /**
     * El constructor `public DynamicElement(By element)` está inicializando una
     * nueva instancia de la
     * clase `DynamicElement`. Toma un objeto `By` como parámetro, que representa la
     * estrategia de
     * localización y el valor para encontrar el elemento en la página web.
     * 
     * @param element elemento a observar
     */
    public DynamicElement(By element) {
        this.elementBy = element;

        this.wait = DriverManager.getFluenWait();
    }

    /**
     * La función espera a que un elemento sea localizado y visible, y luego
     * devuelve el WebElement
     * correspondiente.
     * 
     * @return El método devuelve un WebElement.
     */
    public WebElement getWebElement() {
        this.wait.until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(elementBy),
                        ExpectedConditions.visibilityOfElementLocated(elementBy)));

        return DriverManager.getDriver().findElement(elementBy);
    }

    /**
     * La función waitHide() espera hasta que
     * el elemento web ya no sea visible.
     */
    public void waitHide() {
        this.wait.until(
                ExpectedConditions.invisibilityOf(this.getWebElement()));

    }
}