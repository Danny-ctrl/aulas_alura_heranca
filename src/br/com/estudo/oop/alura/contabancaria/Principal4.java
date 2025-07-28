package br.com.estudo.oop.alura.contabancaria;

public class Principal4 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.consultarSaldo();
        cc.depositar(1500);
        cc.consultarSaldo();
        cc.sacar(500);
        cc.consultarSaldo();
        cc.cobrarTarifaMensal();
        cc.consultarSaldo();


        ConversorMoeda conversor = new ConversorMoeda();
        double valorConvertido = conversor.converterDolarParaReal(150);
        cc.depositar(valorConvertido);
        cc.consultarSaldo();
    }
}
