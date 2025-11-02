package org.example.adapter.after;

/**
 * El Servicio Incompatible (Adaptee).
 * Es la misma clase de antes, no la modificamos.
 */
public class ApiExternaCsv {
    public String obtenerDatosCsv() {
        System.out.println("ApiExternaCsv: Obteniendo datos como CSV...");
        return "id,nombre,email\n1,Ana,ana@mail.com\n2,Beto,beto@mail.com";
    }
}