package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.DynBy;
import base.DynamicElement;
import base.Page;

public class Thanks extends Page {
    @FindBy(xpath = "//span[@class='base']")
    private WebElement title;

    @DynBy(xpath = "//a[@class='action primary continue']")
    private DynamicElement btnContinueShoping;

    @DynBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/checkout/account/delegateCreate/']")
    private DynamicElement btnCreateAccount;

    @DynBy(xpath = "//div[@class='checkout-success']/p/span")
    private DynamicElement nroOrden;

    public WebElement getTitle() {
        return title;
    }

    public WebElement getBtnContinueShoping() {
        return btnContinueShoping.getWebElement();
    }

    public WebElement getBtnCreateAccount() {
        return btnCreateAccount.getWebElement();
    }

    public WebElement getNroOrden() {
        return nroOrden.getWebElement();
    }

}