package org.example.factorymethod.after.visualizador;

import org.example.factorymethod.after.grafico.Grafico;
import org.example.factorymethod.after.grafico.GraficoTorta;

/**
 * Creador Concreto 2.
 * Sobrescribe el factory method para devolver un GraficoTorta.
 */
public class VisualizadorTorta extends Visualizador {
    @Override
    public Grafico crearGrafico() {
        return new GraficoTorta();
    }
}