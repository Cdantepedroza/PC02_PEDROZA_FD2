package org.PC02;

import java.util.ArrayList;

public class Libro {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;
    private ArrayList<Autor> autores = new ArrayList<>();

    // Constructor
    public Libro(String ISBN, String titulo, int anioPublicacion, ArrayList<Autor> autores) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autores = autores;
    }

    public String getISBN() {
        return ISBN;
    }
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }



    @Override
    public String toString() {
        return "Libro{" +
                "ISBN: " + ISBN +
                ", titulo:'" + titulo +
                ", anoPublicacion: " + anioPublicacion +
                ", autores: " + autores +
                "\n";
    }
}
