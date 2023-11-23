package pom.services.pageservices;

import pom.pages.ReviewAndPay;

public class ReviewAndPayService {
    private final ReviewAndPay reviewAndPay = new ReviewAndPay();

    public void confirmar() {
        reviewAndPay.getBtnContinuar().click();
    }
}