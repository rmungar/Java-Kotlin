package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");

        String cadena = sc.nextLine();
        String reverso = "";

        for (int i = cadena.length()-1; i >= 0 ;  i-- ) {
            reverso += cadena.charAt(i);
        }

        System.out.println(reverso);


    }
}
