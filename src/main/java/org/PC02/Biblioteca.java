package org.PC02;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void imprimirPorISBN(String ISBN) {
        boolean isbnEncontrado = false;

        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                isbnEncontrado = true;
                System.out.println("Usuarios que han solicitado el libro con ISBN " + ISBN + ":");
                for (Usuario usuario : usuarios) {
                    for (Libro libroPrestado : usuario.getLibrosPrestados()) {
                        if (libroPrestado.getISBN().equals(ISBN)) {
                            System.out.println("- " + usuario.getNombre());
                        }
                    }
                }
                break; // Salir del bucle una vez que se ha encontrado el ISBN
            }
        }

        // Lanzar excepción si el ISBN no está registrado
        if (!isbnEncontrado) {
            throw new RuntimeException("El código ISBN " + ISBN + " no está registrado en la biblioteca.");
        }
    }


    // Método toString para imprimir información de la biblioteca
    @Override
    public String toString() {
        return "Biblioteca\n" +
                "nombre:" + nombre +"\n"+
                "libros:\n " + libros +"\n"+
                "usuarios:\n" + usuarios+"\n";
    }
}
