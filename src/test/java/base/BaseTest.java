package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected String driverName;
    protected String target;

    public BaseTest(String browser, String target) {
        this.setDriverName(browser);
        this.setTarget(target);

    }

    public abstract void init();

    protected void setDriverName(String name) {
        this.driverName = name;
    }

    protected void setTarget(String target) {
        this.target = target;
    }

    protected void go() {
        DriverManager.getDriver().get(this.target);
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    @BeforeMethod
    public void setUp() {
        // crear el driver segun se necesite
        DriverManager.create(this.driverName);
        this.go();
        this.init();
    }

    @AfterMethod
    public void finish() {
        DriverManager.getDriver().quit();
    }
}