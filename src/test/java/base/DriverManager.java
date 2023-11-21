package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private final static int DEFAULT_SECONDS = 10;

    public static void create(String drivername) {
        driver = WebDriverManager.getInstance(drivername).create();
        createWait(DEFAULT_SECONDS);
    }

    public static void create(String drivername, int seconds) {
        driver = WebDriverManager.getInstance(drivername).create();
        createWait(seconds);
    }

    public static void createWait(int seconds) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

}