package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            while(true){
                System.out.print("Quiere, de celsius a fahrenheit (1) o de fahrenheit a celsius (2): ");

                int opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {

                    System.out.print("Ingrese la temperatura en celsius: ");
                    int celsius = Integer.parseInt(sc.nextLine());
                    System.out.println("Temperatura en Fahrenheit: " + celsiusFahrenheit(celsius));
                    break;
                }
                else if (opcion == 2) {

                    System.out.print("Ingrese la temperatura en fahrenheit: ");
                    int fahrenheit = Integer.parseInt(sc.nextLine());
                    System.out.println("Temperatura en Celsius: " + fahrenheitCelsius(fahrenheit));
                    break;
                }
                else {
                    System.out.println("La opción ingresada no es válida. ");
                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.out.println("El valor ingresado no era válido.");
        }

    }


    public static int celsiusFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int fahrenheitCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
