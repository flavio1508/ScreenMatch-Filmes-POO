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

        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
