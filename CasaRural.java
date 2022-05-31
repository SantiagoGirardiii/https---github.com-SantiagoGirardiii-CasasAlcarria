package CASASALCARRIA;

import java.io.*;
import java.util.Scanner;

public class CasaRural {
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numHabitacion = 0;
    private double precio = 0.0;
    boolean esAlta;

    public CasaRural() {
        esAlta = true;
        asigna();
    }

    public void asigna() {
        Scanner entrada = new Scanner(System.in);
        // try {
        System.out.print("\n Codigo (10 caracteres): ");
        codigo = entrada.nextLine();
        System.out.print("\n Población: ");
        poblacion = entrada.nextLine();
        System.out.print("\n Dirección: ");
        direccion = entrada.nextLine();
        System.out.print("\n Número de habitaciones: ");
        numHabitacion = entrada.nextInt();
        System.out.print("\n Precio por día de estancia: ");
        precio = entrada.nextDouble();
    }

    // catch (IOException e){
    // System.out.println(" Excepcion en la entrada de datos " + e.getMessage()+ " .
    // No se da de alta");
    // esAlta = false;
    // }
    public String elCodigo() {
        return codigo;
    }

    public void muestra() {
        System.out.println("\n Casa Rural " + codigo);
        System.out.println("Población: " + poblacion);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio por día: " + precio);
    }
}