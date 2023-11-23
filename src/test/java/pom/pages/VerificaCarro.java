package pom.pages;

import org.openqa.selenium.WebElement;

import base.DynBy;
import base.DynamicElement;
import base.Page;

public class VerificaCarro extends Page {

    @DynBy(xpath = "//li/button[@title='Proceed to Checkout']")
    DynamicElement btnProceder;

    public WebElement getBtnProceder() {
        return btnProceder.getWebElement();
    }

}