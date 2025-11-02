package org.example.adapter.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Adapter ---");
        ProcesadorMalo procesador = new ProcesadorMalo();
        procesador.procesar();
        System.out.println("------------------------------------------");
    }
}