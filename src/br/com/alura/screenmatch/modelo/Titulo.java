package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos; 

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
                    totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }



    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }



    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }



    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }



    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }



    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }



    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }



    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
