package br.com.estudo.oop.alura.filme;

public class Titulo {
        private String nome;
        private int anoDeLancamento;
        boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacao;
        private int duracaoEmMinutos;



        public int getTotalDeAvaliacao() {
            return totalDeAvaliacao;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAnoDeLancamento() {
            return this.anoDeLancamento;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return this.incluidoNoPlano;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
            return this.duracaoEmMinutos;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void exibeFichaTecnica() {
            System.out.println("Nome: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            System.out.println("Duração em minutos: " + duracaoEmMinutos);
            System.out.println("Incluído no plano: " + incluidoNoPlano);
        }

        public void avalia(double nota) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacao++;
        }

        public double pegaMedia() {
            return somaDasAvaliacoes / (double)totalDeAvaliacao;
        }
    }


