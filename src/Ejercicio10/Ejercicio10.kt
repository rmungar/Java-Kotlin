package Ejercicio10

fun main(){

    try {
        while (true) {
            print("Quiere, de celsius a fahrenheit (1) o de fahrenheit a celsius (2): ")

            val opcion: Int = readln().toInt()

            if (opcion == 1) {
                print("Ingrese la temperatura en celsius: ")
                val celsius: Int = readln().toInt()
                println("Temperatura en Fahrenheit: " + celsiusFahrenheit(celsius))
                break
            } else if (opcion == 2) {
                print("Ingrese la temperatura en fahrenheit: ")
                val fahrenheit: Int = readln().toInt()
                println("Temperatura en Celsius: " + fahrenheitCelsius(fahrenheit))
                break
            } else {
                println("La opción ingresada no es válida. ")
                println()
            }
        }
    } catch (e: Exception) {
        println("El valor ingresado no era válido.")
    }

}


fun celsiusFahrenheit(celsius: Int): Int {
    return (celsius * 9 / 5) + 32
}

fun fahrenheitCelsius(fahrenheit: Int): Int {
    return (fahrenheit - 32) * 5 / 9
}

