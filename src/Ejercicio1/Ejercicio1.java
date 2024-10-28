package Ejercicio1;

import java.util.Scanner;

class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("¡Hola, " + nombre + "!");
    }
}