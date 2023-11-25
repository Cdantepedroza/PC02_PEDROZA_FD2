package org.PC02;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String direccion;
    private String tipoDocumento;
    private int numeroDocumento;
    private ArrayList<Libro> librosPrestados = new ArrayList<>();

    // Constructor
    public Usuario(String nombre, String direccion, String tipoDocumento, int numeroDocumento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }
    @Override
    public String toString() {
        return
                "nombre: " + nombre  +
                ", direccion: " + direccion +
                ", tipoDocumento: " + tipoDocumento+
                ", numeroDocumento: " + numeroDocumento +
                ", librosPrestados: " + librosPrestados;
    }
}
