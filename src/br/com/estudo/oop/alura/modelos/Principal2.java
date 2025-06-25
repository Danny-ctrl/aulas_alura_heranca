package br.com.estudo.oop.alura.modelos;

public class Principal2 {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro("Celta", 45.000, 50.000, 55.000);
        carro1.mostrarDetalhes();

        ModeloCarro carro2 = new ModeloCarro("Fusca",40.000,45.000,50.000);
        carro2.mostrarDetalhes();
    }
}
