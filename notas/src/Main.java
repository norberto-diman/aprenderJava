public class Main {
    public static void main(String[] args) {
        double notaUm = 7.0;
        double notaDois = 7.0;
        double media = (notaUm + notaDois) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 6) {
            System.out.println("Reprovado");
        }
    }
}