package pom.services.pageservices;

import pom.pages.Home;

/**
 * Representa la secuencia de acciones sobre
 * la pagina inicial
 * 
 * @author Daniel Refchke
 */
public class HomeService {
    private final Home home = new Home();

    /**
     * accede al objeto home
     * 
     * @return home inicial
     */
    public Home getHome() {
        return home;
    }

    /**
     * accede al articulo seleccionado
     */
    public void accederArticulo() {
        home.getLink().click();
    }

}