package Ejercicio13;

public class Ejercicio13 {



    public static void main(String[] args) {
        Anime anime1 = new Anime("Bleach", "Shonen", 523);
        Anime anime2 = new Anime("Dragonball", "Shonen", 1000);


        System.out.println(anime1);
        System.out.println(anime2);
    }




    public static class Anime {

        private String _nombre;
        private String _genero;
        private int _episodios;

        public Anime(String nombre, String genero, int episodios) {

            _nombre = nombre;
            _genero = genero;
            _episodios = episodios;
        }


        public String toString(){
            return "Anime: " + _nombre + " es del género " + _genero + " y cuenta con " + _episodios + " episodios.";
        }
    }
}


