package pom.services.pageservices;

import pom.pages.Home;

public class HomeService {
    private final Home home = new Home();

    public Home getHome() {
        return home;
    }

    public void accederArticulo() {
        home.getLink().click();
    }

}