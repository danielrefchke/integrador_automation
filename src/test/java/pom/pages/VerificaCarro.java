package pom.pages;

import org.openqa.selenium.WebElement;

import base.DynBy;
import base.DynamicElement;
import base.Page;

/**
 * Representa la verificacion del carrito
 * 
 * @author Daniel Refchke
 */
public class VerificaCarro extends Page {

    @DynBy(xpath = "//button[@data-role='proceed-to-checkout']")
    DynamicElement btnProceder;

    // elemento de espera, en firefox esta parte da problemas
    @DynBy(xpath = "//th[@class='mark']/strong")
    DynamicElement espera;

    public WebElement getBtnProceder() {
        // esperamos a que el elemento aparezca
        espera.getWebElement();
        // y retornamos el boton
        return btnProceder.getWebElement();
    }

}