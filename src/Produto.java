public class Produto {
    public static void main(String[] args) {
        Produto produto = new Produto("Leite semidesnatado 1L", 4.50);
        System.out.println(produto);
        System.out.println(produto.calcular(4.50, 10));
    }

    String nome;
    double preco;
    int quantidadeDeProdutos;
    double totalProdutos;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String calcular(double preco, int quantidadeDeProdutos) {
        totalProdutos = preco * quantidadeDeProdutos;
        System.out.println("A quantidade de produtos é: " + quantidadeDeProdutos);
        return "O valor total dos produtos é: " + totalProdutos;
    }

    @Override
    public String toString() {

        return "O nome do produto é: " + nome +
                "\nO preço unitário do produto é: " + preco;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
