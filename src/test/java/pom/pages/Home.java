package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Page;

/**
 * Representa la pagina de inicio
 * 
 * @author Daniel Refchke
 */
public class Home extends Page {
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/radiant-tee.html']")
    WebElement link;

    public WebElement getLink() {
        return link;
    }

}