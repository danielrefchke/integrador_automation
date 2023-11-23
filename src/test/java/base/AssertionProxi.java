package base;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * La clase AssertionProxi aplica el patron proxi y proporciona
 * métodos para realizar aserciones en Java
 * y generar mensajes de
 * error personalizados si las aserciones fallan.
 * 
 * @author Daniel Refchke
 */
public class AssertionProxi {

    /**
     * La función comprueba si un valor booleano es verdadero y genera un
     * AssertionError con un mensaje
     * de error personalizado si no lo es.
     * 
     * @param test   Un valor booleano que representa la condición que se está
     *               probando. Si la condición
     *               es verdadera, la prueba pasa. Si la condición es falsa, la
     *               prueba falla.
     * @param errMSg El parámetro errMSg es una cadena que representa el mensaje de
     *               error que se
     *               mostrará si la condición de prueba no es verdadera.
     */
    public static void isTrue(boolean test, String errMSg) {
        Assert.assertTrue(test, errMSg);
    }

    /**
     * La función isEqual comprueba si dos valores de cadena son iguales y arroja un
     * error de aserción
     * con un mensaje personalizado si no lo son.
     * 
     * @param value1  El primer valor a comparar.
     * @param value2  El valor que se va a comparar con el valor1.
     * @param message El parámetro "mensaje" es una cadena que se utiliza para
     *                proporcionar información
     *                o contexto adicional cuando falla la aserción. Normalmente se
     *                utiliza para describir el
     *                comportamiento esperado o el motivo de la afirmación.
     */
    public static void isEqual(String value1, String value2, String message) {
        Assert.assertEquals(value1, value2, message);
    }

    /**
     * La función isEqual comprueba si dos valores enteros son iguales y arroja un
     * AssertionError con
     * un mensaje personalizado si no lo son.
     * 
     * @param value1  El primer valor entero a comparar.
     * @param value2  El parámetro "valor2" es un valor entero que se compara con
     *                "valor1" en el método
     *                Assert.assertEquals.
     * @param message El parámetro "mensaje" es una cadena que se utiliza como
     *                mensaje opcional que se
     *                mostrará si la afirmación falla.
     */
    public static void isEqual(int value1, int value2, String message) {
        Assert.assertEquals(value1, value2, message);
    }

    /**
     * La función comprueba si un texto determinado contiene una cadena específica y
     * arroja un error de
     * aserción con un mensaje personalizado si no es así.
     * 
     * @param text      El parámetro "texto" es una cadena que representa el texto
     *                  en el que desea buscar
     *                  una subcadena específica.
     * @param serarched El parámetro "serarched" es una Cadena que representa el
     *                  texto que estás
     *                  buscando dentro del parámetro "texto".
     * @param message   El parámetro "mensaje" es una cadena que representa el
     *                  mensaje o descripción de
     *                  la aserción. Se utiliza para proporcionar información
     *                  adicional o contexto sobre la afirmación
     *                  cuando falla.
     */
    public static void contains(
            String text,
            String serarched,
            String message) {
        Assert.assertTrue(
                text.contains(serarched),
                message);
    }

    /**
     * La función comprueba si dos cadenas son iguales, ignorando la distinción
     * entre mayúsculas y
     * minúsculas y arroja un error de aserción con un mensaje personalizado si no
     * lo son.
     * 
     * @param value1  El primer valor de cadena a comparar.
     * @param value2  El parámetro "valor2" es un String que representa el segundo
     *                valor a comparar.
     * @param message El parámetro "mensaje" es una cadena que se utiliza como
     *                mensaje de error
     *                personalizado si la afirmación falla. Normalmente se utiliza
     *                para proporcionar información
     *                adicional sobre la afirmación o para explicar el
     *                comportamiento esperado.
     */
    public static void isEqualIgnoreCase(String value1, String value2, String message) {
        Assert.assertEquals(
                value1.toUpperCase(),
                value2.toUpperCase(),
                message);
    }

    /**
     * La función comprueba si una cadena determinada es numérica y arroja un error
     * de aserción con un
     * mensaje personalizado si no lo es.
     * 
     * @param value   El parámetro valor es una cadena que representa un valor que
     *                queremos comprobar si
     *                es numérico o no.
     * @param message El parámetro "mensaje" es una cadena que representa el mensaje
     *                de error que se
     *                mostrará si el valor no es numérico.
     */
    public static void isNumeric(String value, String message) {
        Assert.assertTrue(
                value.matches("\\d+"),
                message);
    }

    /**
     * La función verifica si el valor1 es mayor que el valor2 y arroja un error de
     * aserción con el
     * mensaje dado si no lo es.
     * 
     * @param value1  El primer valor a comparar.
     * @param value2  El parámetro "valor2" es un número entero que representa el
     *                segundo valor a
     *                comparar.
     * @param message El parámetro "mensaje" es una cadena que se utiliza como
     *                mensaje de error si la
     *                afirmación falla.
     */
    public static void isGreater(int value1, int value2, String message) {
        Assert.assertTrue(
                value1 > value2,
                message);
    }

    /**
     * La función verifica si el valor1 es menor que el valor2 y arroja un error de
     * aserción con el
     * mensaje dado si no lo es.
     * 
     * @param value1  Un valor entero que representa el primer valor a comparar.
     * @param value2  El parámetro valor2 es un valor entero que se compara con el
     *                valor1 en el método
     *                isLower.
     * @param message El parámetro "mensaje" es una cadena que se utiliza como
     *                mensaje de error si la
     *                afirmación falla.
     */
    public static void isLower(int value1, int value2, String message) {
        Assert.assertTrue(
                value1 < value2,
                message);
    }

    /**
     * La función comprueba si un objeto es nulo y arroja un error de aserción con
     * un mensaje
     * personalizado si no es nulo.
     * 
     * @param o       El parámetro "o" es un objeto cuya nulidad desea comprobar.
     * @param message El parámetro "mensaje" es una cadena que contiene un mensaje
     *                de error
     *                personalizado que se mostrará si el objeto "o" no es nulo.
     */
    public static void isNull(Object o, String message) {
        Assert.assertNull(o, message);
    }

    /**
     * La función comprueba si un objeto no es nulo y arroja un error de aserción
     * con un mensaje
     * personalizado si es nulo.
     * 
     * @param o       El parámetro "o" es un objeto cuya nulidad desea comprobar.
     * @param message El parámetro "mensaje" es una cadena que se utiliza para
     *                proporcionar información
     *                o contexto adicional cuando falla la aserción. Normalmente se
     *                utiliza para describir el
     *                comportamiento esperado o el motivo de la afirmación.
     */
    public static void notIsNull(Object o, String message) {
        Assert.assertNotNull(o, message);
    }

    /**
     * La función comprueba si un elemento web está habilitado y arroja un error de
     * aserción con un
     * mensaje personalizado si no lo está.
     * 
     * @param element El parámetro del elemento es un objeto WebElement, que
     *                representa un elemento en
     *                una página web. Puede ser cualquier elemento HTML, como un
     *                botón, un campo de entrada o un
     *                enlace.
     * @param message El parámetro "mensaje" es una cadena que se utiliza como
     *                mensaje de error si la
     *                afirmación falla. Normalmente se utiliza para proporcionar más
     *                información sobre el
     *                comportamiento esperado del elemento que se está comprobando.
     */
    public static void isEnabled(WebElement element, String message) {
        Assert.assertTrue(element.isEnabled(), message);
    }

    /**
     * La función comprueba si un elemento web es visible y arroja un error de
     * aserción con un mensaje
     * personalizado si no lo es.
     * 
     * @param element El parámetro del elemento es un objeto WebElement, que
     *                representa un elemento en
     *                una página web. Puede ser cualquier elemento HTML, como un
     *                botón, un campo de entrada o un div.
     * @param message El parámetro "mensaje" es una cadena que se utiliza para
     *                proporcionar un mensaje
     *                de error personalizado si la afirmación falla.
     */
    public static void isVisible(WebElement element, String message) {
        Assert.assertTrue(element.isDisplayed(), message);
    }
}