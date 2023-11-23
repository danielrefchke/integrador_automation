package pom.services.pageservices;

import pom.pages.VerificaCarro;

/**
 * Representa operaciones sobre la pagina del carrito
 * 
 * @author Daniel Refchke
 */
public class VerificaCarroService {
    private final VerificaCarro verificaCarro = new VerificaCarro();

    /**
     * continua adelante con la compra
     */
    public void proceder() {
        verificaCarro.getBtnProceder().click();
    }
}