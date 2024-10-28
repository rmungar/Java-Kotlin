package Ejercicio3

fun main(){

    try {
        print("Ingrese un número para el radio: ")
        val num = readln().toInt()
        val area = kotlin.math.PI * (num * num)

        println("El área del circulo es de: $area")
    }
    catch (e: NumberFormatException) {
        println("El valor ingresado no era un número.")
    }
}