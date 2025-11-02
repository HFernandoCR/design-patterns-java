package org.example.abstractfactory.after.panel;

/**
 * Producto Concreto B2: Implementación de Panel para Sci-Fi.
 */
public class PanelSciFi implements Panel {
    @Override
    public void renderizar() {
        System.out.println("Renderizando panel SCI-FI (de metal)");
    }
}