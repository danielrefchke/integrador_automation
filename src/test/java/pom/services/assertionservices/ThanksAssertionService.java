package pom.services.assertionservices;

import base.AssertionProxi;
import pom.pages.Thanks;

public class ThanksAssertionService {
    public void test(Thanks thanks) {
        /*- El título es igual a “Thank you for purchase!”
        - El botón “Continue Shopping” está habilitado.
        - El botón “Create an Account” está visible.
        - El número de la orden (Your order # is:) es un número (en la captura de
        ejemplo es el 000026889). Pista, mediante el método split() de la clase
        String, podrá separar todo el texto en palabras.
         */

        testBotonContinue(thanks);
        testBotonCreateAccount(thanks);
        testNroOrden(thanks);
        testTitle(thanks);
    }

    public void testBotonContinue(Thanks thanks) {
        AssertionProxi.isEnabled(
                thanks.getBtnContinueShoping(),
                "El boton continue shopping no esta habilitado");
    }

    public void testBotonCreateAccount(Thanks thanks) {
        AssertionProxi.isVisible(thanks.getBtnCreateAccount(),
                "El boton create account no es visible");
    }

    public void testTitle(Thanks thanks) {
        AssertionProxi.isEqual(
                thanks.getTitle().getText(),
                "Thank you for your purchase!",
                "El Titulo no es “Thank you for your purchase!”");
    }

    public void testNroOrden(Thanks thanks) {
        AssertionProxi.isNumeric(
                thanks.getNroOrden().getText(),
                "el numero de orden no es un numero");
    }
}