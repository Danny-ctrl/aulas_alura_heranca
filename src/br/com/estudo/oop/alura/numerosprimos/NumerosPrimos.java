package br.com.estudo.oop.alura.numerosprimos;

public class NumerosPrimos {

    public boolean verficarNumerosprimos(int n){
       if(n <= 1) return false;
       for(int i = 2; i <= Math.sqrt(n); i++){
           if(n % i == 0) return false;
       }
       return true;
    }
    public void listarNumerosprimos(int limite){
        System.out.println("Números primos até " + limite + ": ");
        for(int i = 2; i <= limite; i++){
            if(verficarNumerosprimos(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println("");
    }
}
