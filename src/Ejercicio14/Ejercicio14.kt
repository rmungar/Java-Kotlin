package Ejercicio14




fun main(){

val inventario = mutableListOf<Videojuego>()

try {
    while (true) {
        println("1 - Añadir Videojuego")
        println("2 - Eliminar Videojuego")
        println("3 - Mostrar Inventario")
        println("4 - Salir")
        print("Ingrese la acción que quiere llevar acabo: ")
        val opcion = readln().toInt()

        if (opcion == 1) {
            print("Ingrese el nombre del videojuego: ")
            val nombre = readln()
            print("Ingrese la plataforma del videojuego: ")
            val plataforma = readln()
            print("Ingrese el número de horas: ")
            val horas = readln().toInt()

            val videojuego = Videojuego(nombre, plataforma, horas)
            inventario.add(videojuego)
            println("$nombre añadido correctamente.")
            println()
        } else if (opcion == 2) {
            print("Ingrese el nombre del videojuego: ")
            val nombre = readln()
            val inventario2 = inventario
            for (videojuego in inventario) {
                if (videojuego.titulo == nombre) {
                    inventario.remove(videojuego)
                }
            }
            println()
            if (inventario2 == inventario) {
                println("$nombre no ha sido elminado.")
            } else print("$nombre eliminado correctamente. ")
            println()
        } else if (opcion == 3) {
            println("Este es tu inventario: ")
            inventario.forEach{
                println(it)
            }
            println()
        } else if (opcion == 4) {
            break
        } else {
            println("Opcion no valida.")
            println()
        }
    }
}
catch (e: Exception) {
    println("El valor introducido no era correcto.")
}
}

class Videojuego(val titulo: String,  val plataforma: String,  val horasJugadas: Int) {
    override fun toString(): String {
        return "$titulo jugable en $plataforma cuenta con $horasJugadas horas jugadas."
    }
}