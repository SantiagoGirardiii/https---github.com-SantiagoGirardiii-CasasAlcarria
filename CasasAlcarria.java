package CASASALCARRIA;

import java.io.*;
import java.util.Scanner;

public class CasasAlcarria {
    public static void main(String[] args) {
        TablaDispersa tabla = new TablaDispersa();
        Scanner sc = new Scanner(System.in);
    int a;
    do{
        System.out.println("ingrese 1 para  agregar casa , 2 para buscar , 3 para eliminar , 0 PARA SALIR");
        a = sc.nextInt();
        switch(a){
            case 1:
                CasaRural casa = new CasaRural();
                CasaRural.muestra();
                TablaDispersa.insertar(casa);
                sc.nextLine();
            break;
            case 2:
                sc.nextLine();
                System.out.println("ingrese codigo de vivienda");
                String b = sc.nextLine();
                TablaDispersa.buscar(b);
                sc.nextLine();
            break;
            case 3:
            System.out.println("ingrese codigo de vivienda");
                 b = sc.nextLine();
            TablaDispersa.eliminar(b);
            sc.nextLine();
            break;
        }

    }
    while ( a != 0);
}
}
