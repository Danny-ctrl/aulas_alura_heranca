package br.com.estudo.oop.alura.filme;
import br.com.estudo.oop.alura.calculo.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("O Poderoso Chefão");
        favorito.setAnoDeLancamento(2019);
        favorito.setDuracaoEmMinutos(180);

        favorito.exibeFichaTecnica();
        favorito.avalia(10);
        favorito.avalia(7);
        favorito.avalia(8);

        System.out.println(favorito.getTotalDeAvaliacao());
        System.out.println(favorito.pegaMedia());

        Serie supernatural = new Serie();
        supernatural.setNome("Supernatural");
        supernatural.setAnoDeLancamento(2005);
        supernatural.setTemporadas(15);
        supernatural.setEpisodiosPorTemporada(22);
        supernatural.setMinutosPorEpisodio(50);
        System.out.println("Nome: " + supernatural.getNome());
        System.out.println("Duração em minutos para maratonar supernatural: " + supernatural.getDuracaoEmMinutos());


        Filme favorito2 = new Filme();
        favorito2.setNome("Os vingadores:Ultimato");
        favorito2.setAnoDeLancamento(2019);
        favorito2.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(favorito2);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());



    }
}
