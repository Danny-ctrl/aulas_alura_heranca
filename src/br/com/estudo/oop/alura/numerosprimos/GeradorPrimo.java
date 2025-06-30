package br.com.estudo.oop.alura.numerosprimos;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int aPartirDe){
        int atual = aPartirDe + 1;
        while(true){
            if(verficarNumerosprimos(atual)){
                return atual;
            }
            atual++;
        }
    }
}
