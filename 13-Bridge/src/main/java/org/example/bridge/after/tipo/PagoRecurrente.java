package org.example.bridge.after.tipo;

import org.example.bridge.after.procesador.IPagoProcesador;

/**
 * Abstracción Refinada 2 (Pago Recurrente).
 */
public class PagoRecurrente extends Pago {

    public PagoRecurrente(IPagoProcesador procesador, double montoMensual) {
        super(procesador, montoMensual);
    }

    @Override
    public void ejecutar() {
        System.out.println("Lógica de Pago Recurrente: Creando suscripción por $" + monto);
        // Llama a la implementación a través del puente
        procesador.crearSuscripcion(monto);
    }
}