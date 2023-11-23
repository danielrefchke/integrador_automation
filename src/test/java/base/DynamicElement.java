package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class DynamicElement {
    protected By elementBy;
    protected Wait<WebDriver> wait;

    public DynamicElement(By element) {
        this.elementBy = element;

        this.wait = DriverManager.getFluenWait();
    }

    public WebElement getWebElement() {
        this.wait.until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(elementBy),
                        ExpectedConditions.visibilityOfElementLocated(elementBy)));

        return DriverManager.getDriver().findElement(elementBy);
    }
}