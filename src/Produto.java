public class Produto {

    String nome;
    double preco;
    int quantidadeDeProdutos;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcular(int quantidadeDeProdutos) {
        double precoTotal = preco * quantidadeDeProdutos;
        return precoTotal;
    }

    @Override
    public String toString() {

        return "O nome do produto é: " + nome +
                "\nO preço unitário do produto em real é: " + preco;
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
