package org.example.factorymethod.after.grafico;

/**
 * Producto Concreto 1.
 */
public class GraficoBarra implements Grafico {
    @Override
    public void renderizar() {
        System.out.println("Renderizando un gráfico de BARRAS.");
    }
}