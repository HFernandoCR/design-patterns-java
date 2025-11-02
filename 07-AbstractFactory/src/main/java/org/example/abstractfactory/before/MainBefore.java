package org.example.abstractfactory.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Abstract Factory ---");

        // El cliente debe saber el "string" del tema y la clase generadora está llena de 'if'
        UIGeneradorMalo generadorFantasia = new UIGeneradorMalo("FANTASIA");
        generadorFantasia.renderizarUICompleta();

        System.out.println("---");

        UIGeneradorMalo generadorSciFi = new UIGeneradorMalo("SCIFI");
        generadorSciFi.renderizarUICompleta();

        System.out.println("-------------------------------------------------");
    }
}