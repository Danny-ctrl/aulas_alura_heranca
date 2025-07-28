package br.com.estudo.oop.alura.area;

public class Principal5 {
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(6,6);

        double area = sala.calcularArea();
        double perimetro = sala.calcularPerimetro();

        System.out.println("Area da sala: " + area + " m²");
        System.out.println("Perimetro da sala : " + perimetro + "m");
    }
}
