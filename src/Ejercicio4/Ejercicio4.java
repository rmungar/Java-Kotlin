package Ejercicio4;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = numAlet();

        while(true){
            System.out.print("Ingrese un número: ");
            int n = Integer.parseInt(sc.nextLine());

            if (num == n) {
                System.out.println("HAS ACERTADO!!!");
                        break;
            }
            else if (num < n) System.out.println("El número que estas buscando es mas pequeño....");
            else System.out.println("El número que estas buscando es mayor....");
            System.out.println();
        }

    }

    public static int numAlet(){
        return RandomGenerator.getDefault().nextInt(1,100);
    }
}
