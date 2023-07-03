import br.com.alura.screenmatch.medelo.Filmes;

public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.nome = "Homem de ferro";
        meuFilme.anoDeLancamento = 2008;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações:" + meuFilme.getTotalDeAvaliacoes()
);

        System.out.println(meuFilme.pegaMedia());
        // meuFilme.somaDasAvaliacao = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());
    }
}
