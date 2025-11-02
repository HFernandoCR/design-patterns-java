package org.example.bridge.after;

import org.example.bridge.after.procesador.IPagoProcesador;
import org.example.bridge.after.procesador.ProcesadorPayPal;
import org.example.bridge.after.procesador.ProcesadorStripe;
import org.example.bridge.after.tipo.Pago;
import org.example.bridge.after.tipo.PagoRecurrente;
import org.example.bridge.after.tipo.PagoUnico;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Bridge (Ej 2) ---");

        // 1. Creamos las implementaciones (Pasarelas)
        IPagoProcesador stripe = new ProcesadorStripe("sk_live_123456");
        IPagoProcesador payPal = new ProcesadorPayPal("cliente@paypal.com");

        // 2. Combinamos libremente Abstracción + Implementación

        // Escenario A: Pago Único con Stripe
        Pago pago1 = new PagoUnico(stripe, 100.00);
        pago1.ejecutar();

        System.out.println("---");

        // Escenario B: Pago Recurrente con PayPal
        Pago pago2 = new PagoRecurrente(payPal, 50.00);
        pago2.ejecutar();

        System.out.println("---");

        // Escenario C: Pago Recurrente con Stripe
        // ¡Se puede crear al vuelo! No necesitamos una nueva clase.
        Pago pago3 = new PagoRecurrente(stripe, 30.00);
        pago3.ejecutar();

        System.out.println("-------------------------------------------------");
    }
}