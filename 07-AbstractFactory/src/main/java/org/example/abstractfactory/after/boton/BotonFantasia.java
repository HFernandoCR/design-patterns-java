package org.example.abstractfactory.after.boton;

/**
 * Producto Concreto A1: Implementación de Botón para Fantasía.
 */
public class BotonFantasia implements Boton {
    @Override
    public void renderizar() {
        System.out.println("Renderizando botón de FANTASÍA (con runas)");
    }
}