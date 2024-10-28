package Ejercicio2

fun main() {

    try{
        print("Ingrese un número: ")
        val num = readln().toInt()
        if (num % 2 == 0) println("El numero $num es par")
        else println("El numero $num es impar")
    }
    catch (e: Exception){
        println("El valor ingresado no era un número")
    }

}