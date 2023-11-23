package pom.services.pageservices;

import pom.pages.VerificaCarro;

public class VerificaCarroService {
    private final VerificaCarro verificaCarro = new VerificaCarro();

    public void proceder() {
        verificaCarro.getBtnProceder().click();
    }
}