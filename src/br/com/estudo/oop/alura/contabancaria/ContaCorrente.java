package br.com.estudo.oop.alura.contabancaria;

public class ContaCorrente extends ContaBancaria{


    public boolean cobrarTarifaMensal(){
        double tarifa = 12.00;
        if(getSaldo() >= tarifa){
            setSaldo(getSaldo() - tarifa);
            System.out.println("Tarifa mensal: "+ tarifa + " cobrada");
            return true;
        }else{
            System.out.println("Saldo insuficiente para cobrança da tarifa mensal");
            return false;
        }
    }
}
