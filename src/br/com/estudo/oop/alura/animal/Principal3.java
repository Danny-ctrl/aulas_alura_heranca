package br.com.estudo.oop.alura.animal;

public class Principal3 {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro();
        Gato siames = new Gato();

        caramelo.emitirSom();
        caramelo.abanarRabo();

        siames.emitirSom();
        siames.arranharMoveis();

    }
}
