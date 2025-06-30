package br.com.estudo.oop.alura.conta_bancaria;

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

    }
}
