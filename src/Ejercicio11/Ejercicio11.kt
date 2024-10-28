package Ejercicio11

fun main(){

    try {
        print("¿Cuántos números quieres? ")
        val veces = readln().toInt()


        var num1 = 0
        var num2 = 1

        var secuencia = "0 1 "
        repeat(veces){
            val num3 = num1 + num2
            secuencia += "$num3 "

            num1 = num2
            num2 = num3
        }

        println(secuencia)
    }
    catch (e: Exception){
        println("El valor ingresado no era un número.")
    }
}