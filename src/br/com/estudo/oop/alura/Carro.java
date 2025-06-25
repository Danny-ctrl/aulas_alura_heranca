package br.com.estudo.oop.alura;

public class Carro {
    private String modelo;
    private double[] precos = new double[3];


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPrecos (double preco1, double preco2, double preco3) {
      precos[0] = preco1;
      precos[1] = preco2;
      precos[2] = preco3;
    }

    public void exibirPrecos() {
        System.out.println("Preços médios do modelo " + modelo + ":");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Ano" + (i + 1) + ": R$" + precos[i]);
        }
    }

    public void exibirMenorPreco() {
        double menorPreco = precos[0];
        for(double preco : precos) {
            if(preco < menorPreco) {
                menorPreco = preco;
            }
        }
    }

    public void exibirMaiorPreco() {
        double maiorPreco = precos[0];
        for(double preco : precos) {
            if(preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        System.out.println("Maior preço: R$" + maiorPreco);

    }

}
