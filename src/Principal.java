public class Principal {
    public static void main(String[] args){
        Filmes meuFilme = new Filmes();
        meuFilme.nome = "Homem de ferro";
        meuFilme.anoDeLancamento = 2008;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);//acesso o atributo
    }
}