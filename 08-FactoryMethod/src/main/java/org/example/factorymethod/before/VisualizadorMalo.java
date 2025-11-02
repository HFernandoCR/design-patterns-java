package org.example.factorymethod.before;

/**
 * VIOLA OCP y tiene lógica de creación acoplada.
 * Esta clase debe saber cómo construir CADA tipo de gráfico.
 */
public class VisualizadorMalo {

    /**
     * Este método tiene la lógica de creación (el 'new') dentro.
     * Si añadimos un GraficoLinea, TENEMOS QUE MODIFICAR este método.
     */
    public Grafico crearGrafico(String tipo) {
        Grafico grafico;
        if (tipo.equalsIgnoreCase("BARRA")) {
            grafico = new GraficoBarra();
        } else if (tipo.equalsIgnoreCase("TORTA")) {
            grafico = new GraficoTorta();
        } else {
            // Valor por defecto o error
            throw new IllegalArgumentException("Tipo de gráfico no soportado");
        }
        return grafico;
    }

    // La lógica de negocio (mostrar) está mezclada con la creación
    public void mostrarGrafico(String tipo) {
        Grafico g = crearGrafico(tipo);
        System.out.print("VisualizadorMalo: ");
        g.renderizar();
    }
}