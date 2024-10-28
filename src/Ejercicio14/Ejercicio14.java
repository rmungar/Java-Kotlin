package Ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        ArrayList<Videojuego> inventario = new ArrayList<Videojuego>();
        Scanner sc = new Scanner(System.in);
        try{
            while(true){

                System.out.println("1 - Añadir Videojuego");
                System.out.println("2 - Eliminar Videojuego");
                System.out.println("3 - Mostrar Inventario");
                System.out.println("4 - Salir");
                System.out.print("Ingrese la acción que quiere llevar acabo: ");
                int opcion = sc.nextInt();

                if(opcion == 1){

                    System.out.print("Ingrese el nombre del videojuego: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese la plataforma del videojuego: ");
                    String plataforma = sc.next();
                    System.out.print("Ingrese el número de horas: ");
                    int horas = sc.nextInt();

                    Videojuego videojuego = new Videojuego(nombre, plataforma, horas);
                    inventario.add(videojuego);
                    System.out.println(nombre + " añadido correctamente.");
                    System.out.println();
                }
                else if(opcion == 2){
                    System.out.print("Ingrese el nombre del videojuego: ");
                    String nombre = sc.next();
                    ArrayList<Videojuego> inventario2 = inventario;
                    for (Videojuego videojuego : inventario) {
                        if (videojuego._titulo.equals(nombre)) {
                            inventario.remove(videojuego);
                        }
                    }
                    if (inventario2 == inventario) {System.out.println(nombre + " no ha sido elminado.");}
                    else System.out.print(nombre + " eliminado correctamente. ");
                    System.out.println();
                }
                else if(opcion == 3){
                    System.out.println("Este es tu inventario: ");
                    inventario.forEach(videojuego -> System.out.println(videojuego));
                    System.out.println();
                }
                else if (opcion == 4) {
                    break;
                }
                else{
                    System.out.println("Opcion no valida.");
                    System.out.println();
                }
            }
        }
        catch (Exception e){
            System.out.println("El valor introducido no era correcto.");
        }
    }


    public static class Videojuego{

        private String _titulo;
        private String _plataforma;
        private int _horasJugadas;

        public Videojuego(String titulo, String plataforma, int horasJugadas) {
            _titulo = titulo ;
            _plataforma = plataforma;
            _horasJugadas = horasJugadas;
        }


        public String toString() {

            return _titulo + " jugable en " + _plataforma + " cuenta con " + _horasJugadas + " horas jugadas.";

        }
    }
}
