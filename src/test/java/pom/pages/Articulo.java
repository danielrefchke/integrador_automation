package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.DynBy;
import base.DynamicElement;
import base.Page;

public class Articulo extends Page {
    @DynBy(id = "option-label-size-143-item-169")
    private DynamicElement size;

    @DynBy(id = "option-label-color-93-item-56")
    private DynamicElement color;

    @DynBy(id = "qty")
    private DynamicElement quantity;

    @DynBy(id = "product-addtocart-button")
    private DynamicElement buttonAdd;

    @DynBy(xpath = "//div[@data-bind=\"scope: 'messages'\"]/div[@class='messages']")
    private DynamicElement linkCart;

    public WebElement getSize() {
        return size.getWebElement();
    }

    public WebElement getColor() {
        return color.getWebElement();
    }

    public WebElement getQuantity() {
        return quantity.getWebElement();
    }

    public WebElement getButtonAdd() {
        return buttonAdd.getWebElement();
    }

    public WebElement getLinkCart() {

        return this.linkCart.getWebElement().findElement(
                By.xpath(".//a"));

    }

}