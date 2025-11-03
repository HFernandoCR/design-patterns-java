package org.example.facade.before;

// Parte 2 del subsistema complejo
public class SubsystemaGraficos {
    public void configurarResolucion() {
        System.out.println("SubsystemaGraficos: Resolución configurada a 1080p.");
    }
    public void renderizar() {
        System.out.println("SubsystemaGraficos: Renderizando frame...");
    }
    public void liberarMemoriaVideo() {
        System.out.println("SubsystemaGraficos: Memoria de video liberada.");
    }
}