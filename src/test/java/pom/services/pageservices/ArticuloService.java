package pom.services.pageservices;

import org.openqa.selenium.WebElement;

import pom.pages.Articulo;

/**
 * Representa operaciones sobre la pagina de articulos
 * 
 * @author Daniel Refchke
 */
public class ArticuloService {
    private final Articulo articulo = new Articulo();

    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * configura el articulo
     */
    public void configurarArticulo() {
        this.articulo.getSize().click();
        this.articulo.getColor().click();

        WebElement cantidad = this.articulo.getQuantity();
        cantidad.clear();
        cantidad.sendKeys("2");

    }

    /**
     * agrega al carrito de compras
     */
    public void agregar() {
        this.articulo.getButtonAdd().click();
    }

    /**
     * va a la pagina del carrito
     */
    public void goCart() {
        this.articulo.getLinkCart().click();
    }

}