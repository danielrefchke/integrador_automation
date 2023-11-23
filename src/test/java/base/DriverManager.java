package base;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * La `clase pública DriverManager` es una clase que gestiona la creación y
 * configuración de una
 * instancia de WebDriver. Proporciona métodos para crear la instancia de
 * WebDriver, configurar el
 * tiempo de espera para la visibilidad del elemento y recuperar las instancias
 * de WebDriver y de
 * espera.
 * 
 * @author Daniel Refchke
 */
public class DriverManager {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Wait<WebDriver> fluentWait;

    public final static int DEFAULT_SECONDS = 15;

    /**
     * La función crea una instancia de WebDriver utilizando el nombre del
     * controlador especificado y
     * establece un tiempo de espera predeterminado.
     * 
     * @param drivername El parámetro `drivername` es una cadena que especifica el
     *                   tipo de WebDriver que
     *                   se creará.Puede ser "chrome", "firefox", "safari", etc.,
     *                   dependiendo de
     *                   los controladores web disponibles y sus correspondientes
     *                   nombres.
     */
    public static void create(String drivername) {
        driver = WebDriverManager.getInstance(drivername).create();
        createWait(DEFAULT_SECONDS);
    }

    /**
     * La función crea una instancia de WebDriver utilizando el nombre del
     * controlador especificado y
     * espera la cantidad de segundos especificada.
     * 
     * @param drivername El parámetro nombre del controlador es una cadena que
     *                   especifica el tipo de
     *                   controlador web que se utilizará. Puede ser "chrome",
     *                   "firefox", "safari", etc., dependiendo de
     *                   los controladores web disponibles y sus correspondientes
     *                   nombres.
     * @param seconds    El parámetro "segundos" es un valor entero que representa
     *                   la cantidad de segundos
     *                   que se deben esperar antes de realizar la siguiente acción.
     */
    public static void create(String drivername, int seconds) {
        driver = WebDriverManager.getInstance(drivername).create();
        createWait(seconds);
    }

    /**
     * La función crea un objeto de espera FluentWait con una duración de tiempo de
     * espera e intervalo de sondeo
     * específicos.
     * 
     * @param seconds El parámetro "segundos" es la duración en segundos durante la
     *                cual se debe
     *                establecer la espera. Determina cuánto tiempo esperará el
     *                código hasta que se cumpla una
     *                determinada condición antes de continuar con el siguiente
     *                paso.
     */
    public static void createWait(int seconds) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        fluentWait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(DEFAULT_SECONDS))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
    }

    /**
     * La función devuelve el objeto WebDriver.
     * 
     * @return El método devuelve un objeto WebDriver.
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * La función devuelve un objeto WebDriverWait.
     * 
     * @return El método devuelve un objeto WebDriverWait.
     */
    public static WebDriverWait getWait() {
        return wait;
    }

    /**
     * La función devuelve un objeto FluentWait para WebDriver.
     * 
     * @return El método devuelve un objeto Wait<WebDriver>.
     */
    public static Wait<WebDriver> getFluenWait() {
        return fluentWait;
    }

}