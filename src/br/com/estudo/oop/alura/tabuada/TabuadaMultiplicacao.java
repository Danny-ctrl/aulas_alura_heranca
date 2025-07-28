package br.com.estudo.oop.alura.tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }
    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
