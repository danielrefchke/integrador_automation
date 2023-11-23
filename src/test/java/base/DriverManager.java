package base;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Wait<WebDriver> fluentWait;

    public final static int DEFAULT_SECONDS = 15;

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
        fluentWait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(DEFAULT_SECONDS))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static Wait<WebDriver> getFluenWait() {
        return fluentWait;
    }

}