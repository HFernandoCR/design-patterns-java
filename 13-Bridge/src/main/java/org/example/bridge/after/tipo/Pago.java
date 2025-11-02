package org.example.bridge.after.tipo;

import org.example.bridge.after.procesador.IPagoProcesador;

/**
 * La Abstracción (Abstraction).
 * Mantiene el "puente" (bridge) a la implementación (Procesador).
 */
public abstract class Pago {
    protected IPagoProcesador procesador;
    protected double monto;

    protected Pago(IPagoProcesador procesador, double monto) {
        this.procesador = procesador;
        this.monto = monto;
    }

    // El método de alto nivel que el cliente usará
    public abstract void ejecutar();
}