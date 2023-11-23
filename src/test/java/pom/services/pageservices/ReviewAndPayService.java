package pom.services.pageservices;

import pom.pages.ReviewAndPay;

/**
 * Representa operaciones sobre la pagina de revision y pago
 * 
 * @author Daniel Refchke
 */
public class ReviewAndPayService {
    private final ReviewAndPay reviewAndPay = new ReviewAndPay();

    /**
     * confirma la operacion
     */
    public void confirmar() {
        // esperamos que el loader se esfume
        reviewAndPay.getLoader().waitHide();
        // y damos click
        reviewAndPay.getBtnContinuar().click();
    }
}