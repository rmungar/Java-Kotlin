package Ejercicio7

fun main(){

    print("Ingrese una cadena: ")
    val cadena = readln()
    var reverso = ""

    for (i in cadena.length-1 downTo 0 ){
        reverso += cadena[i]
    }

    println("Cadena inversa: $reverso")

}