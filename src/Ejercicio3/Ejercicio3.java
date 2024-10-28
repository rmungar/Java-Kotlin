package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número para el radio: ");
            int n = Integer.parseInt(sc.nextLine());

            double area = Math.PI * Math.pow(n, 2);

            System.out.println("El área del círculo es de: " + area);
        }
        catch (Exception e) {
            System.out.println("El valor ingresado no era un número");
        }
    }
}
