package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * La clase BaseTest es una clase abstracta que
 * proporciona un marco para crear clases de prueba con un
 * navegador y una URL de destino específicos, asi como una
 * serie de métodos útiles de inicializacion y finalización
 * 
 * @author Daniel Refchke
 */
public abstract class BaseTest {

    protected String driverName;
    protected String target;

    /**
     * Constructor de la clase
     * 
     * @param browser indica el nombre del browser a gestionar
     * @param target  indica la url inicial desde donde arrancar
     */
    public BaseTest(String browser, String target) {
        this.setDriverName(browser);
        this.setTarget(target);

    }

    /**
     * La función "init" es un método abstracto que
     * debe implementarse en una subclase. Esta
     * pensado para proveer operaciones comunes en los
     * distintos test, como ser iniciar sesion.
     */
    public abstract void init();

    /**
     * La función establece el nombre del driver a usar.
     * 
     * @param name El nombre del driver.
     */
    protected void setDriverName(String name) {
        this.driverName = name;
    }

    /**
     * La función establece el valor de la variable "destino".
     * 
     * @param target El parámetro "destino" es una cadena que representa el valor
     *               que se establecerá
     *               para la propiedad de destino.
     */
    protected void setTarget(String target) {
        this.target = target;
    }

    /**
     * La función go (ir) abre la URL de destino
     * especificada.
     */
    protected void go() {
        DriverManager.getDriver().get(this.target);
    }

    /**
     * La función devuelve la instancia de WebDriver obtenida del DriverManager.
     * 
     * @return El método devuelve una instancia de la interfaz WebDriver.
     */
    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    /**
     * La función setUp() se utiliza para crear el controlador, navegar a una página
     * web e inicializar
     * los componentes necesarios antes de ejecutar cada método de prueba.
     */
    @BeforeMethod
    public void setUp() {
        // crear el driver segun se necesite
        DriverManager.create(this.driverName);
        this.go();
        this.init();
    }

    /**
     * La función finish cierra el controlador utilizado
     * en la prueba.
     */
    @AfterMethod
    public void finish() {
        DriverManager.getDriver().quit();
    }
}