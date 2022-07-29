public class Pereciveis extends Produto {

    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString() + " e possui o vencimento de: " + diasParaVencer + " dia(s).";
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double precoTotal = super.calcular(quantidadeDeProdutos);
        if (diasParaVencer == 1) {
           return precoTotal - ((precoTotal * 25) / 100);
        }
        else if (diasParaVencer == 2) {
            return precoTotal - ((precoTotal * 33.33) / 100);
        }
        else if (diasParaVencer == 3) {
            return precoTotal - ((precoTotal * 50) / 100);
        }

        return precoTotal;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
