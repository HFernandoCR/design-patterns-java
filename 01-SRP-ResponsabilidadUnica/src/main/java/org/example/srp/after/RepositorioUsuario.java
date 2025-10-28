package org.example.srp.after;

/**
 * RESPONSABILIDAD ÚNICA: Persistir (guardar) datos del usuario.
 */
public class RepositorioUsuario {

    public void guardar(Usuario usuario) {
        System.out.println("Guardando usuario '" + usuario.getNombre() + "' en la base de datos...");
        // ... Lógica de interacción con la base de datos (JDBC, JPA, etc.) ...
        System.out.println("Usuario '" + usuario.getNombre() + "' guardado exitosamente.");
        // Simular un posible error de BD
        // if (usuario.getNombre().equals("Error")) {
        //     throw new RuntimeException("Error simulado de base de datos");
        // }
    }
}