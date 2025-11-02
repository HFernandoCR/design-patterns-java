package org.example.logic.model;

import java.time.LocalDate;

// Clase de datos (Modelo)
public class Usuario {
    private String nombre;
    private TipoUsuario tipo;
    private LocalDate fechaRegistro;

    public Usuario(String nombre, TipoUsuario tipo, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() { return nombre; }
    public TipoUsuario getTipo() { return tipo; }
    public LocalDate getFechaRegistro() { return fechaRegistro; }
}