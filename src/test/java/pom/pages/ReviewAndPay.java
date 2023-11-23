package pom.pages;

import org.openqa.selenium.WebElement;

import base.DynBy;
import base.DynamicElement;
import base.Page;

/**
 * Representa la pagina de confirmacion y pago
 * 
 * @author Daniel Refchke
 */
public class ReviewAndPay extends Page {
    @DynBy(xpath = "//button[@title='Place Order']")
    private DynamicElement btnContinuar;

    // elemento que da dolor de cabeza
    // hay que esperar a que se oculte
    @DynBy(xpath = "//img[@src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/loader-2.gif']")
    private DynamicElement loader;

    public WebElement getBtnContinuar() {
        return btnContinuar.getWebElement();
    }

    public DynamicElement getLoader() {
        // lo mandamos como esta para la espera
        return loader;
    }

}