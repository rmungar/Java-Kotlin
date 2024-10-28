package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");

        String numero = sc.nextLine();
        String numeroInverso = "";

        for (int i = numero.length()-1; i >= 0 ;  i-- ) {
            numeroInverso += numero.charAt(i);
        }

        System.out.println(numeroInverso);

    }
}
