package org.example.factorymethod.after.visualizador;

import org.example.factorymethod.after.grafico.Grafico;
import org.example.factorymethod.after.grafico.GraficoBarra;

/**
 * Creador Concreto 1.
 * Sobrescribe el factory method para devolver un GraficoBarra.
 */
public class VisualizadorBarra extends Visualizador {
    @Override
    public Grafico crearGrafico() {
        return new GraficoBarra();
    }
}