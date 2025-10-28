package org.example.srp.after;

// Clase simple para representar los datos del usuario
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        // Aquí podrían ir validaciones si fueran responsabilidad del objeto Usuario
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}