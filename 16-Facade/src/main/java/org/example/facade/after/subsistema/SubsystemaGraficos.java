package org.example.facade.after.subsistema;

// (Copiar el código de org.example.facade.before.SubsystemaGraficos.java)
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