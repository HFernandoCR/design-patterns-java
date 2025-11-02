package org.example.adapter.before;

/**
 * Servicio Incompatible (Adaptee).
 * Esta es una librería "antigua" que no podemos modificar.
 * Devuelve los datos en un formato CSV simple.
 */
public class ApiExternaCsv {
    public String obtenerDatosCsv() {
        System.out.println("ApiExternaCsv: Obteniendo datos como CSV...");
        // Simula la respuesta de la API
        return "id,nombre,email\n1,Ana,ana@mail.com\n2,Beto,beto@mail.com";
    }
}