package org.example.factorymethod.after.grafico;

/**
 * Producto Concreto 3 (¡Nuevo!).
 */
public class GraficoLinea implements Grafico {
    @Override
    public void renderizar() {
        System.out.println("Renderizando un gráfico de LÍNEA.");
    }
}