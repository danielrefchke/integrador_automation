package pom.pages;

import org.openqa.selenium.WebElement;

import base.DynBy;
import base.DynamicElement;
import base.Page;

public class ReviewAndPay extends Page {
    @DynBy(xpath = "//button[@title='Place Order']")
    private DynamicElement btnContinuar;

    public WebElement getBtnContinuar() {
        return btnContinuar.getWebElement();
    }

}