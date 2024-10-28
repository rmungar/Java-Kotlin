package Ejercicio9

fun main(){

    print("Ingrese un número: ")

    val numero = readln().toInt()

    var primo = true

    for (i in 2..< numero) {
        if (numero % i == 0) primo = false
    }
    if (primo) {
        println("El número $numero es primo")
    }
    else {
        println("El número $numero no es primo")
    }
}