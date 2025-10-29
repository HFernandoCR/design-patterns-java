package org.example.isp.before;

// Esta clase necesita todos los métodos, así que parece estar bien.
public class TrabajadorHumano implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Humano trabajando...");
    }

    @Override
    public void comer() {
        System.out.println("Humano comiendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Humano descansando (zzz...)");
    }
}