public class Filmes {
    String nome;
    int anoDeLancamento;
    Boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibiFichaTecnica() {
        System.out.println("nome do filme" + nome);// acesso o atributo
    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }
}