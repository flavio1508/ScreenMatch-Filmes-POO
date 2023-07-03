package br.com.alura.screenmatch.medelo;
public class Filmes {
    public String nome;
    int anoDeLancamento;
    Boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibiFichaTecnica() {
        System.out.println("nome do filme" + nome);// acesso o atributo
    }

    public void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }

    
}