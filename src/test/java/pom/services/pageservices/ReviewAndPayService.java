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
        reviewAndPay.getBtnContinuar().click();
    }
}