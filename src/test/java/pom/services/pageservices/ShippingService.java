package pom.services.pageservices;

import org.openqa.selenium.WebElement;

import pom.pages.Shipping;

/**
 * Representa operaciones sobre la pagina de configuracion del envio
 * 
 * @author Daniel Refchke
 */
public class ShippingService {
    private final Shipping shipping = new Shipping();

    /**
     * carga los datos
     */
    public void cargarDatos() {
        shipping.getEmail().clear();

        setData(shipping.getEmail(), "pedro@pascual.com");

        setData(shipping.getFirstName(), "Pedro");

        setData(shipping.getLastName(), "Pascual");

        setData(shipping.getCompany(), "Compania");

        setData(shipping.getStreet0(), "Calle 0");

        setData(shipping.getStreet1(), "Calle 1");

        setData(shipping.getStreet2(), "Calle 2");

        setData(shipping.getCity(), "Cuidad");

        setData(shipping.getPostCode(), "12345-6789");

        setData(shipping.getTelephone(), "21589488");

        shipping.getRadio().click();

        shipping.getRegionId().selectByValue("4");

        shipping.getBtnContinuar().click();
    }

    /**
     * es privado, pero realiza operaciones muy repetidas
     * sobre los campos de texto
     * 
     * @param e    elemento
     * @param data texto a enviar al elemento
     */
    private void setData(WebElement e, String data) {
        e.clear();
        e.sendKeys(data);
    }
}