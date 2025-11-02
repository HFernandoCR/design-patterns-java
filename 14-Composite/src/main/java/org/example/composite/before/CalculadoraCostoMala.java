package org.example.composite.before;

/**
 * Cliente que viola OCP.
 * Tiene la lógica de recorrido y cálculo mezclada.
 * Debe usar 'instanceof' para diferenciar entre tipos.
 */
public class CalculadoraCostoMala {

    public double calcular(Object componente) {
        double costoTotal = 0;

        // ¡VIOLACIÓN! El cliente necesita saber los tipos concretos
        if (componente instanceof Pieza) {
            Pieza pieza = (Pieza) componente;
            System.out.println("  Calculando pieza: " + pieza.getNombre() + " ($" + pieza.getCosto() + ")");
            costoTotal = pieza.getCosto();

        } else if (componente instanceof Ensamblaje) {
            Ensamblaje ensamblaje = (Ensamblaje) componente;
            System.out.println("Calculando ensamblaje: " + ensamblaje.getNombre());

            // Lógica recursiva DENTRO del cliente
            for (Object subComponente : ensamblaje.getComponentes()) {
                costoTotal += calcular(subComponente); // Llamada recursiva
            }
        }
        return costoTotal;
    }
}