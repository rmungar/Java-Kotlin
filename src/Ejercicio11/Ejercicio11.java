package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {


    public static void main(String[] args) {

        int veces = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de veces que desea: ");
        veces = sc.nextInt();

        int numero1 = 0;
        int numero2 = 1;
        String inicioSecuencia = "0 1 ";
        for (int i = 1; i < veces; i++) {
            int numeroActual = numero1 + numero2;
            inicioSecuencia += numeroActual + " ";

            numero1 = numero2;
            numero2 = numeroActual;
        }

        System.out.println(inicioSecuencia);
    }
}
