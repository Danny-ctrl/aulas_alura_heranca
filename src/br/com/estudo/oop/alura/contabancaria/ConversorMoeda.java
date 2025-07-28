package br.com.estudo.oop.alura.contabancaria;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CONVERSAO = 5.00;
    @Override
    public double converterDolarParaReal(double valorDolar) {
        double valorConvertido = valorDolar * TAXA_CONVERSAO;
        System.out.println("US$ " + valorDolar + " equivale a R$ " + valorConvertido);
        return valorConvertido;
    }
}
