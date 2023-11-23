# integrador_automation
Trabajo integrador del curso de Testing Automation - Concordia

Desarrollador: Daniel Refchke

Docente: Nelson Campos

Caso de Prueba - Compra de Prenda en Magento

Descripción: Este caso de prueba tiene como objetivo automatizar la compra de una prenda en el sitio web de Magento.

Pasos:
1. Abrir el navegador e ir al sitio web de Magento:
https://magento.softwaretestingboard.com/
2. Seleccionar la prenda "Radiant Tee".
3. Configurar las opciones de la prenda:
a. Tamaño: L
b. Color: Azul
c. Cantidad: 2
4. Hacer clic en "Add to Cart".
5. Hacer clic en el enlace "shopping cart".
6. Hacer clic en "Proceed to Checkout".
7. Completar el formulario de dirección de envío con los datos deseados.
8. Seleccionar la primera opción en los Métodos de Envío.
9. Hacer clic en "Next".
10. Hacer clic en "Place Order".

Validaciones:

- El título es igual a “Thank you for purchase!”*
- El botón “Continue Shopping” está habilitado.
- El botón “Create an Account” está visible.
- El número de la orden (Your order # is:) es un número (en la captura de ejemplo es el 000026889). Pista, mediante el método split() de la clase String, podrá separar todo el texto en palabras.

* es Thank you for your purchase!

Punto de acceso a las pruebas:
    src/test/java/test/Integrador.java

Librerias:
    El paquete src/test/java/base contiene las clases que conforman el framework de las pruebas.

Estructura
    El paquete src/test/java/pom contiene las clases para la pruebas siguiendo el patron Page Object Model

    El paquete src/test/java/pom/pages contiene las paginas

    El paquete src/test/java/pom/services contiene los distintos
    servicios, a saber:

        src/test/java/pom/services/pageservices contiene los servicios de las distintas paginas

        src/test/java/pom/services/assertionservices contiene las pruebas (aserciones) que se deben realizar

Documentacion:
    Todo el codigo del framework esta documentado en Javadoc.

Implementaciones futuras:
    la anotacion @DynBy va a poder generar los Getters de modo automatico