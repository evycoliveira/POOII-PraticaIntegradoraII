public class PraticaExcecoes {

    private int a = 0, b = 300;

    public void dividir() {

        try {
            if (a == 0)
                throw new IllegalArgumentException("Não pode ser dividido por zero.");
        } catch (IllegalArgumentException exception) {
        exception.printStackTrace();
        }
    }
}
