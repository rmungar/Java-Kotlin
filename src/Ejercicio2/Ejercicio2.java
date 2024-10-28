package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int n = Integer.parseInt(sc.nextLine());

            if (n%2 == 0) System.out.println("El número " + n + "es par.");
            else System.out.println("El número " + n + "es impar.");
        } catch (Exception e) {
            System.out.println("El valor ingresado no era un número");
        }
    }
}
