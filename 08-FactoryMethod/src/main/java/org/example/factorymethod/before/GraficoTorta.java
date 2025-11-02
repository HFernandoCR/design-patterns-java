package org.example.factorymethod.before;

public class GraficoTorta implements Grafico {
    @Override
    public void renderizar() {
        System.out.println("Renderizando un gráfico de TORTA (circular).");
    }
}