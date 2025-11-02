package org.example.abstractfactory.after.panel;

/**
 * Producto Concreto B1: Implementación de Panel para Fantasía.
 */
public class PanelFantasia implements Panel {
    @Override
    public void renderizar() {
        System.out.println("Renderizando panel de FANTASÍA (de madera)");
    }
}