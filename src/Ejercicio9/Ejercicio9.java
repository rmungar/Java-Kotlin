package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        if (primo) {System.out.println("El numero " + numero + " es primo");}
        else {System.out.println("El numero " + numero + " no es primo");}
    }
}
