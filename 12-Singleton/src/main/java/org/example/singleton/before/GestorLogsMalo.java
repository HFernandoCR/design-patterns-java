package org.example.singleton.before;

import java.util.ArrayList;
import java.util.List;

/**
 * PROBLEMA: Una clase normal de logging.
 * Cada módulo que la cree tendrá su propia lista de logs separada.
 */
public class GestorLogsMalo {

    private String modulo;
    private List<String> logs = new ArrayList<>();

    public GestorLogsMalo(String modulo) {
        this.modulo = modulo;
        System.out.println("Creando nuevo GestorLogsMalo para: " + modulo);
    }

    public void anotar(String nivel, String mensaje) {
        String entrada = "[" + nivel + "] [" + modulo + "] " + mensaje;
        System.out.println("Anotando solo en este log: " + entrada);
        logs.add(entrada);
    }

    public void imprimirLog() {
        System.out.println("--- Log individual de " + modulo + " ---");
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println("------------------------------------");
    }
}