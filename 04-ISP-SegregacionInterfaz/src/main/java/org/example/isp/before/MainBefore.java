package org.example.isp.before;

public class MainBefore {

    public static void gestionarDiaTrabajador(Trabajador trabajador) {
        System.out.println("\nGestionando día para: " + trabajador.getClass().getSimpleName());
        trabajador.trabajar();
        try {
            // El cliente asume que todos los trabajadores pueden comer y descansar
            trabajador.comer();
            trabajador.descansar();
        } catch (UnsupportedOperationException e) {
            // El cliente TIENE que manejar la excepción porque la interfaz es muy gorda
            System.err.println("  ERROR: Operación no soportada -> " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar ISP ---");

        Trabajador humano = new TrabajadorHumano();
        Trabajador robotMalo = new TrabajadorRobotMalo();

        gestionarDiaTrabajador(humano); // Funciona sin problemas
        gestionarDiaTrabajador(robotMalo); // Lanza excepciones

        System.out.println("---------------------------------------");
    }
}