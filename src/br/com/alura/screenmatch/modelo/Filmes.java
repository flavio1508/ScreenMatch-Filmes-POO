package br.com.alura.screenmatch.modelo;

public class Filmes {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos; 

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
}