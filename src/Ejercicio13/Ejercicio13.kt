package Ejercicio13

fun main(){
    val anime1 = Anime("Bleach", "Shonen", 523)
    val anime2 = Anime("Dragonball", "Shonen", 1000)

    println(anime1)
    println(anime2)
}


class Anime(val nombre: String, val genero: String, val episodios: Int){


    override fun toString(): String {
        return "Anime: $nombre es del género $genero y cuenta con $episodios episodios."
    }
}