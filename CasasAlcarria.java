package CASASALCARRIA;

import java.util.Scanner;

class CasasAlvarria {
    public static void main(String[] args) {
        TablaDispersa tabla = new TablaDispersa();
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("ingrese 1 para agregar casa, 2 para buscar, 3 para eliminar , 0 para salir ");
            a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    CasaRural casa = new CasaRural();
                    casa.muestra();
                    tabla.insertar(casa);
                    break;
                case 2:
                    System.out.print("ingrese codigo de vivienda");
                    String b = sc.nextLine();
                    tabla.buscar(b);
                    break;
                case 3:
                    System.out.println("ingrese codigo de vivienda");
                    b = sc.nextLine();
                    tabla.eliminar(b);
                    break;
            }
        } while (a != 0);
    }
}