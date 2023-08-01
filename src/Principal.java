import br.com.alura.screenmatch.modelo.Filmes;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.setNome( "Homem de ferro");
        meuFilme.setAnoDeLancamento(  2008);
        meuFilme.setDuracaoEmMinutos( 180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações:" + meuFilme.getTotalDeAvaliacoes()
);

        System.out.println(meuFilme.pegaMedia());
        // meuFilme.somaDasAvaliacao = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());

        Serie maquinaMortifera = new Serie();
        maquinaMortifera.setNome("Maquina Mortifera");
    }
}
