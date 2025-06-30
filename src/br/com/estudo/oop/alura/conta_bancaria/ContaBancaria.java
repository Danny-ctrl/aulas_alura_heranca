package br.com.estudo.oop.alura.conta_bancaria;

public class ContaBancaria {
    private double saldo;
    private double valor;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    protected double getSaldo(){
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void consultarSaldo(){
      System.out.println("Saldo atual: "+ saldo);
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$: " + valor + " realizado com sucesso");
            return true;
        }else {
            System.out.println("Valor de deposito  inválido ");
            return false;
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " realizado com sucesso");
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
