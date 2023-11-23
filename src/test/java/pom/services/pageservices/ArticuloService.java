package pom.services.pageservices;

import org.openqa.selenium.WebElement;

import pom.pages.Articulo;

public class ArticuloService {
    private final Articulo articulo = new Articulo();

    public Articulo getArticulo() {
        return articulo;
    }

    public void configurarArticulo() {
        this.articulo.getSize().click();
        this.articulo.getColor().click();

        WebElement cantidad = this.articulo.getQuantity();
        cantidad.clear();
        cantidad.sendKeys("2");

    }

    public void agregar() {
        this.articulo.getButtonAdd().click();
    }

    public void goCart() {
        this.articulo.getLinkCart().click();
    }

}