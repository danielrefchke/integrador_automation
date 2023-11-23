package pom.services.assertionservices;

import base.AssertionProxi;
import pom.pages.Thanks;

/**
 * Representa la secuencia de pruebas sobre
 * la pagina final
 * 
 * @author Daniel Refchke
 */
public class ThanksAssertionService {
    public void test(Thanks thanks) {
        /*
         * Las validaciones son las siguientes:
         * -El título es igual a “Thank you for your purchase!”
         * (en el enunciado decia Thank you for purchase!)
         * - El botón “Continue Shopping” está habilitado.
         * - El botón “Create an Account” está visible.
         * - El número de la orden (Your order # is:) es un número
         */

        testBotonContinue(thanks);
        testBotonCreateAccount(thanks);
        testNroOrden(thanks);
        testTitle(thanks);
    }

    /**
     * Prueba que el botón “Continue Shopping” está habilitado.
     * 
     * @param thanks pagina sobre la que se hace la validacion
     */
    public void testBotonContinue(Thanks thanks) {
        AssertionProxi.isEnabled(
                thanks.getBtnContinueShoping(),
                "El boton continue shopping no esta habilitado");
    }

    /**
     * El botón “Create an Account” está visible.
     * 
     * @param thanks pagina sobre la que se hace la validacion
     */
    public void testBotonCreateAccount(Thanks thanks) {
        AssertionProxi.isVisible(thanks.getBtnCreateAccount(),
                "El boton create account no es visible");
    }

    /**
     * El título es igual a “Thank you for your purchase!”
     * 
     * @param thanks pagina sobre la que se hace la validacion
     */
    public void testTitle(Thanks thanks) {
        AssertionProxi.isEqual(
                thanks.getTitle().getText(),
                "Thank you for your purchase!",
                "El Titulo no es “Thank you for your purchase!”");
    }

    /**
     * El número de la orden (Your order # is:) es un número
     * 
     * @param thanks pagina sobre la que se hace la validacion
     */
    public void testNroOrden(Thanks thanks) {
        AssertionProxi.isNumeric(
                thanks.getNroOrden().getText(),
                "el numero de orden no es un numero");
    }
}