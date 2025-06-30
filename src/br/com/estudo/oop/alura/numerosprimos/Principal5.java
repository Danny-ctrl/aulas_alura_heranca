package br.com.estudo.oop.alura.numerosprimos;

public class Principal5 {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        verificador.verificarSeEhPrimo(17);
        verificador.verificarSeEhPrimo(18);

        verificador.listarNumerosprimos(30);

        int proximo = gerador.gerarProximoPrimo(30);
        System.out.println("Próximo primos após 30: " + proximo);
    }
}
