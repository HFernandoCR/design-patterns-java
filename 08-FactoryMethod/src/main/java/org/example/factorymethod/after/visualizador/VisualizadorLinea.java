package org.example.factorymethod.after.visualizador;

import org.example.factorymethod.after.grafico.Grafico;
import org.example.factorymethod.after.grafico.GraficoLinea;

/**
 * Creador Concreto 3 (¡Nuevo!).
 * Se añade sin modificar Visualizador, Grafico, ni el cliente.
 */
public class VisualizadorLinea extends Visualizador {
    @Override
    public Grafico crearGrafico() {
        return new GraficoLinea();
    }
}