public class Main {

    public static void main(String[] args) {

        PraticaExcecoes excecoes = new PraticaExcecoes();
        excecoes.dividir();

        Produto produto = new Produto("Flocos de aveia 500g", 10.0);
        System.out.println(produto);
        System.out.println("O preço total dos produtos em reais é: " + produto.calcular(10));

        Pereciveis pereciveis = new Pereciveis("Leite Desnatado 1L", 5.90, 1);
        System.out.println(pereciveis);
        System.out.println( "O valor total dos produtos em reais com desconto é: " + pereciveis.calcular(10));
    }
}
