package org.example.factorymethod.after.grafico;

/**
 * Producto Concreto 2.
 */
public class GraficoTorta implements Grafico {
    @Override
    public void renderizar() {
        System.out.println("Renderizando un gráfico de TORTA (circular).");
    }
}