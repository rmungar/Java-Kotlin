package Ejercicio8

fun main(){

    print("Ingrese una cadena: ")
    val cadena = readln().lowercase()
    var contador = 0
    val vocales = listOf<String>("a","e","i","o","u")

    for (letra in cadena){

        if (vocales.contains(letra.toString())){
            contador++
        }

    }

    println("Total vocales: $vocales")
}