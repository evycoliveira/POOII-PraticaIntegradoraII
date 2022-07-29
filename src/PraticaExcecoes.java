public class PraticaExcecoes {

    public static void main(String[] args) {

        dividir();
    }

    public static void dividir() {
        int a = 0, b = 300;

        try { double resultado = b / a; }
        catch (ArithmeticException exception) { System.out.println("Ocorreu um erro: " + exception.getMessage()); }
        finally { System.out.println("Programa finalizado."); }

    }
}
