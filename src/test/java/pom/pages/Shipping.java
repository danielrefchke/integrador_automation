package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.DynBy;
import base.DynamicElement;
import base.Page;

public class Shipping extends Page {

    @DynBy(id = "customer-email")
    private DynamicElement email;

    @DynBy(xpath = "//div/input[@name='firstname']")
    private DynamicElement firstName;

    @DynBy(xpath = "//div/input[@name='lastname']")
    private DynamicElement lastName;

    @DynBy(xpath = "//div/input[@name='company']")
    private DynamicElement company;

    @DynBy(xpath = "//div/input[@name='street[0]']")
    private DynamicElement street0;

    @DynBy(xpath = "//div/input[@name='street[1]']")
    private DynamicElement street1;

    @DynBy(xpath = "//div/input[@name='street[2]']")
    private DynamicElement street2;

    @DynBy(xpath = "//div/input[@name='city']")
    private DynamicElement city;

    @DynBy(xpath = "//div/input[@name='postcode']")
    private DynamicElement postCode;

    @DynBy(xpath = "//div/input[@name='telephone']")
    private DynamicElement telephone;

    @DynBy(xpath = "//div/select[@name='region_id']")
    private DynamicElement regionId;

    @DynBy(xpath = "//div/select[@name='country_id']")
    private DynamicElement countryId;

    @DynBy(xpath = "//input[@name='ko_unique_1']")
    private DynamicElement radio;

    @DynBy(xpath = "//button[@data-role='opc-continue']")
    private DynamicElement btnContinuar;

    public WebElement getBtnContinuar() {
        return btnContinuar.getWebElement();
    }

    public WebElement getTelephone() {
        return telephone.getWebElement();
    }

    public Select getRegionId() {
        return new Select(regionId.getWebElement());
    }

    public WebElement getCountryId() {
        return countryId.getWebElement();
    }

    public WebElement getRadio() {
        return radio.getWebElement();
    }

    public WebElement getLastName() {
        return lastName.getWebElement();
    }

    public WebElement getCompany() {
        return company.getWebElement();
    }

    public WebElement getStreet0() {
        return street0.getWebElement();
    }

    public WebElement getStreet1() {
        return street1.getWebElement();
    }

    public WebElement getStreet2() {
        return street2.getWebElement();
    }

    public WebElement getCity() {
        return city.getWebElement();
    }

    public WebElement getFirstName() {
        return firstName.getWebElement();
    }

    public WebElement getEmail() {
        return email.getWebElement();
    }

    public WebElement getPostCode() {
        return postCode.getWebElement();
    }

}