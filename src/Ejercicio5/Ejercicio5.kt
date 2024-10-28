package Ejercicio5

fun main(){

    try {
        print("Ingrese un número: ")
        val numero = readln().toInt()

        println("Tabla de multiplicar del número $numero")
        for(i in 1..10){

            println("$numero x $i = ${numero*i}")

        }
    }
    catch (e: Exception){
        println("El valor ingresado no era un número.")

    }


}