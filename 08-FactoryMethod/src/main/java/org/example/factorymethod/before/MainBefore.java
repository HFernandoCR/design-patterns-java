package org.example.factorymethod.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Factory Method ---");
        VisualizadorMalo visualizador = new VisualizadorMalo();

        // El cliente debe saber el "string" del tipo que quiere crear
        visualizador.mostrarGrafico("BARRA");
        visualizador.mostrarGrafico("TORTA");

        // Si quisiéramos "LINEA", tendríamos que modificar VisualizadorMalo.java
        // visualizador.mostrarGrafico("LINEA"); // Esto fallaría

        System.out.println("-------------------------------------------------");
    }
}