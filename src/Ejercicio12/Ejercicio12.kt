package Ejercicio12

fun main(){


    try {
        print("Ingrese un número: ")
        val num = readln().toInt()
        var numInverso = ""

        for(i in num.toString().length-1 downTo 0){
            numInverso += num.toString()[i]
        }
        println("Su número al revés es: $numInverso")
    }
    catch (e: Exception){
        println(e.message)
    }

}