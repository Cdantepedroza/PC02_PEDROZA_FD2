package org.PC02;

public class Autor {
    private String nombreCompleto;
    private int anioNacimiento;
    private String paisNacimiento;

    // Constructor
    public Autor(String nombreCompleto, int anoNacimiento, String paisNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.anioNacimiento = anoNacimiento;
        this.paisNacimiento = paisNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombreCompleto: " + nombreCompleto +
                ", anoNacimiento: " + anioNacimiento +
                ", paisNacimiento: " + paisNacimiento +
                '}';
    }
}
