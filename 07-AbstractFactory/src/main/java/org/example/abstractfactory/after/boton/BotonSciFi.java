package org.example.abstractfactory.after.boton;

/**
 * Producto Concreto A2: Implementación de Botón para Sci-Fi.
 */
public class BotonSciFi implements Boton {
    @Override
    public void renderizar() {
        System.out.println("Renderizando botón SCI-FI (holográfico)");
    }
}