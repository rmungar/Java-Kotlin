package Ejercicio4

import kotlin.random.Random

fun main(){

    try {

        val numAlet = Random.nextInt(1, 100)

        while (true){
            println("Ingrese un número: ")
            val n = readln().toInt()

            if (numAlet == n) {
                println("HAS ACERTADO!!!")
                break
            }
            else if (numAlet > n) println("El numero que estas buscando es mayor....")
            else println("El número que estas buscando es menor....")
            println()
        }
    }
    catch (e: Exception){
        println("El valor ingresado no era un número.")
    }

}