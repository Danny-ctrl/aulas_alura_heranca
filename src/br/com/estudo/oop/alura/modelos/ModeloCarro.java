package br.com.estudo.oop.alura.modelos;

public class ModeloCarro extends Carro {
    public ModeloCarro(String modelo,double preco1, double preco2, double preco3) {
        setModelo(modelo);
        setPrecos(preco1,preco2,preco3);
    }

    public void mostrarDetalhes(){
        System.out.println("\nModelo: "+getModelo());
        exibirPrecos();
        exibirMenorPreco();
        exibirMaiorPreco();
    }
}
