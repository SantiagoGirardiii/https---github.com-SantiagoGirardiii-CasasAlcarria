package CASASALCARRIA;

import java.io.*;
import java.util.Scanner;

public class TablaDispersa {
    static final int TAMTABLA = 101;
    private static int numElementos;
    private static double factorCarga;
    private static CasaRural[] tabla;

    public TablaDispersa() {
        tabla = new CasaRural[TAMTABLA];
        for (int j = 0; j < TAMTABLA; j++)
            tabla[j] = null;
        numElementos = 0;
        factorCarga = 0.0;
    }

    public static int direccion(String clave) {
        int i = 0, p;
        long d;
        d = transformaCadena(clave);// aplica aritmética modular para obtener dirección base
        p = (int) (d % TAMTABLA);
        // bucle de exploración
        while (tabla[p] != null && !tabla[p].elCodigo().equals(clave)) {
            i++;
            p = p + i * i;
            p = p % TAMTABLA; // considera el array como circular
        }
        return p;
    }

    static long transformaCadena(String c) {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(10, c.length()); j++) {
            d = d * 27 + (int) c.charAt(j);
        }
        if (d < 0)
            d = -d;
        return d;
    }

    public static void insertar(CasaRural r) {
        int posicion;
        posicion = direccion(r.elCodigo());
        tabla[posicion] = r;
        numElementos++;
        factorCarga = (double) (numElementos) / TAMTABLA;
        if (factorCarga > 0.5)
            System.out.println("\n!! Factor de carga supera el 50%.!!" + " Conviene aumentar el tamaño.");
    }

    public static CasaRural buscar(String clave) {
        CasaRural pr;
        int posicion;
        posicion = direccion(clave);
        pr = tabla[posicion];
        if (pr != null)
            if (!pr.esAlta)
                pr = null;
        pr.muestra();
        return pr;
    }

    public static void eliminar(String clave) {
        int posicion;
        posicion = direccion(clave);
        if (tabla[posicion] != null)
            tabla[posicion].esAlta = false;
    }
}
