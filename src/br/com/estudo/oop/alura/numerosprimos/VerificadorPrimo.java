package br.com.estudo.oop.alura.numerosprimos;

public class VerificadorPrimo extends NumerosPrimos{

    public void verificarSeEhPrimo(int numero){
        if(verficarNumerosprimos(numero)){
            System.out.println("Número " + numero + " é primo");
        }else{
            System.out.println("Número " + numero + " não é primo");
        }
    }
}
