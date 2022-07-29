public class PraticaExcecoes {

    private static int a = 0, b = 300;
    public static void main(String[] args) {

        dividir();
    }

    public static void dividir() {

        try {
            if (a == 0)
                throw new IllegalArgumentException("Não pode ser dividido por zero.");
        } catch (IllegalArgumentException exception) {
        exception.printStackTrace();
        }
    }
}
