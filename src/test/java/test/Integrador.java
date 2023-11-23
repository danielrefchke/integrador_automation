package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pom.services.assertionservices.ThanksAssertionService;
import pom.services.pageservices.ArticuloService;
import pom.services.pageservices.HomeService;
import pom.services.pageservices.ReviewAndPayService;
import pom.services.pageservices.ShippingService;
import pom.services.pageservices.ThanksService;
import pom.services.pageservices.VerificaCarroService;

public class Integrador extends BaseTest {

    public Integrador() {
        super("chrome", "https://magento.softwaretestingboard.com/");
    }

    @Test
    public void test1() {
        HomeService homeService = new HomeService();
        homeService.accederArticulo();

        ArticuloService articuloService = new ArticuloService();

        articuloService.configurarArticulo();

        articuloService.agregar();

        articuloService.goCart();

        new VerificaCarroService().proceder();

        new ShippingService().cargarDatos();

        new ReviewAndPayService().confirmar();

        new ThanksAssertionService().test(new ThanksService().getThanks());

    }

    @Override
    public void init() {
        // inicializaciones, como ir al home
        // pero en este caso no es necesario
    }

}