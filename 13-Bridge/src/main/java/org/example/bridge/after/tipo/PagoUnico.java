package org.example.bridge.after.tipo;

import org.example.bridge.after.procesador.IPagoProcesador;

/**
 * Abstracción Refinada 1 (Pago Único).
 */
public class PagoUnico extends Pago {

    public PagoUnico(IPagoProcesador procesador, double monto) {
        super(procesador, monto);
    }

    @Override
    public void ejecutar() {
        System.out.println("Lógica de Pago Único: Validando pago de $" + monto);
        // Llama a la implementación a través del puente
        procesador.procesarPago(monto);
    }
}