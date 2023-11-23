package pom.services.pageservices;

import pom.pages.Thanks;

/**
 * Representa operaciones sobre la pagina final
 * 
 * @author Daniel Refchke
 */
public class ThanksService {
    private final Thanks thanks = new Thanks();

    public Thanks getThanks() {
        return thanks;
    }

}