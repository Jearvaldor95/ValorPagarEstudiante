/*
 Programa que calcula e imprime
 el curso del estudiante (Pregrado o Posgrado)
 el valor a pagar del estudinte
 los creditos del estudiante
 los descuentos aplicados al estudiante.
 si el estudiante tiene un promedio >= 4,5 y su curso es pregrado  sus creditos son 28 y el descuento 25%,
si el estudiante tiene un promedio >= 4 y <4,5 su curso es pregrado  sus creditos son 25 y el descuento 10%,
si el estudiante tiene un promedio >= 3,5 y <4, su curso es pregrado  sus creditos son 20 y el descuento 0%,
si el estudiante tiene un promedio >= 2,5 y <3,5 su curso es pregrado  sus creditos son 15 y el descuento 0%,
si el estudiante tiene promedio <2,5 y su curso es pregrado, este estudiante no puede matricularse.
si el estudiante tiene un promedio >= 4,5 y su curso es posgrado  sus creditos son 20 y el descuento 20%,
si el estudiante tiene un promedio < 4,7 y su curso es posgrado  sus creditos son 10 y el descuento 0%,
 */
package Estudiante;

/**
 *
 * @author USUARIO
 */
public class Estudiante {

   private double promedio;
    private boolean pregrado;
    private boolean posgrado;
    private String curso;

    public Estudiante(double promedio, boolean pregrado, boolean posgrado, String curso) {
        this.promedio = promedio;
        this.pregrado = pregrado;
        this.posgrado = posgrado;
        this.curso = curso;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean getPregrado() {
        return pregrado;
    }

    public void setPregrado(boolean pregrado) {
        this.pregrado = pregrado;
    }

    public boolean getPosgrado() {
        return posgrado;
    }

    public void setPosgrado(boolean posgrado) {
        this.posgrado = posgrado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void DatosEstudiante() {
        int creditos = 0, descuento = 0, valorcreditos = 0;
        if (promedio >= 4.5 && curso == "pregrado") {
            creditos = 28;
            descuento = 25;
        }
        if (promedio >= 4 && promedio < 4.5 && curso == "pregrado") {
            creditos = 25;
            descuento = 10;
        }
        if (promedio >= 3.5 && promedio < 4 && curso == "pregrado") {
            creditos = 20;
            descuento = 0;
        }
        if (promedio >= 2.5 && promedio < 3.5 && curso == "pregrado") {
            creditos = 15;
            descuento = 0;
        }
        if (promedio < 2.5 && curso == "pregrado") {
            System.out.println("el estudiante no puede matricularse");
        }
        if (promedio >= 4.5 && curso == "posgrado") {
            creditos = 20;
            descuento = 20;
        }
        if (promedio < 4.5 && curso == "posgrado") {
            creditos = 10;
            descuento = 0;
        }
        if (pregrado) {
            valorcreditos = 50000;
        }
        if (posgrado) {
            valorcreditos = 300000;
        }

        int totaldescuento = creditos * valorcreditos * descuento / 100;
        int totalpagar = creditos * valorcreditos - totaldescuento;
        System.out.println("el curso es:" + curso);
        System.out.println("el valor a pagar del alumno es:" + totalpagar);
        System.out.println("los creditos son:" + creditos);
        System.out.println("los descuentos son:" + descuento);

    }

    public static void main(String[] args) {

        Estudiante Estudiante = new Estudiante(4.5, false, true, "pregrado");

        Estudiante.DatosEstudiante();
    }

}
