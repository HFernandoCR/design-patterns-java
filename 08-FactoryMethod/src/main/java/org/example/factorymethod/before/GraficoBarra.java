package org.example.factorymethod.before;

public class GraficoBarra implements Grafico {
    @Override
    public void renderizar() {
        System.out.println("Renderizando un gráfico de BARRAS.");
    }
}