package Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int totalVocales = 0;
        String [] vocales = {"a","e", "i", "o", "u"};

        for (int i = 0; i <= cadena.length() -1; i++) {
            for (int j = 0; j <= vocales.length - 1; j++) {
                if (cadena.split("")[i].equals(vocales[j])) {
                    totalVocales++;
                }
            }
        }

        System.out.println("Total vocales: " + totalVocales);

    }
}
