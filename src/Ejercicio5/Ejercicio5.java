package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Ingrese un numero: ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.println("Tabla de multiplicar del " + numero);
            for (int i = 1; i <= 10; i++) {

                System.out.println(numero + " x " + i + " = " + (numero * i));

            }

        }catch(Exception e){

            System.out.println("El valor ingresado no era un número.");
        }

    }
}
