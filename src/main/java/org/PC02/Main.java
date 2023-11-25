package org.PC02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //PREGUNTA C
        Biblioteca biblioteca = new Biblioteca("Biblioteca nacional");
        Autor autor1 = new Autor("Vargas Llosa", 1936, "Perú");
        Autor autor2 = new Autor("García Márquez", 1927, "Colombia");
        Autor autor3 = new Autor("Borges", 1899, "Argentina");

        // Crear libros con autores
        ArrayList<Autor> autoresLibro1 = new ArrayList<>();
        autoresLibro1.add(autor1);
        Libro libro1 = new Libro("ISBN1", "Libro 1", 2000, autoresLibro1);

        ArrayList<Autor> autoresLibro2 = new ArrayList<>();
        autoresLibro2.add(autor2);

        Libro libro2 = new Libro("ISBN2", "Libro 2", 2010, autoresLibro2);
        libro2.agregarAutor(autor1);
        ArrayList<Autor> autoresLibro3 = new ArrayList<>();
        autoresLibro3.add(autor1);
        autoresLibro3.add(autor3);
        Libro libro3 = new Libro("ISBN3", "Libro 3", 2020, autoresLibro3);

        Usuario usuario1 = new Usuario("User1", "Dirección 1", "DNI", 12345);
        Usuario usuario2 = new Usuario("User2", "Dirección 2", "CarnetExtranjeria", 67890);
        Usuario usuario3 = new Usuario("User3", "Dirección 3", "DNI", 54321);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);
        biblioteca.agregarUsuario(usuario3);

        usuario1.agregarLibroPrestado(libro1);
        usuario2.agregarLibroPrestado(libro3);
        usuario3.agregarLibroPrestado(libro3);


        //PREGUNTA D
        System.out.println(biblioteca.toString());
        System.out.println("<================================================>");
        System.out.print("Ingrese el ISBN del libro para encontrar usuarios: ");
        String isbnConsulta = scanner.next();

        //PREGUNTA E
        try {
            biblioteca.imprimirPorISBN(isbnConsulta);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}