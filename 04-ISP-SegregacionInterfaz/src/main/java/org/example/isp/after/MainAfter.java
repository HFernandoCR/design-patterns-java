package org.example.isp.after;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar ISP ---");

        GestionTareas gestor = new GestionTareas();

        TrabajadorHumanoBueno humano = new TrabajadorHumanoBueno();
        TrabajadorRobotBueno robot = new TrabajadorRobotBueno();

        // El gestor puede pasar CUALQUIER Trabajable a ejecutarTareaTrabajo
        gestor.ejecutarTareaTrabajo(humano);
        gestor.ejecutarTareaTrabajo(robot); // Funciona sin problemas

        // El gestor solo puede pasar objetos Comible a gestionarComida
        gestor.gestionarComida(humano);
        // gestor.gestionarComida(robot); // Esto daría error de compilación, ¡lo cual es bueno!

        // El gestor solo puede pasar objetos Descansable a gestionarDescanso
        gestor.gestionarDescanso(humano);
        // gestor.gestionarDescanso(robot); // Esto daría error de compilación

        System.out.println("----------------------------------------");
    }
}wa