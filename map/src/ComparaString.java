public class ComparaString {
    public static void main(String[] args) {
        String igualIgual1 = "Norberto";
        String igualIgual2 = "Norberto";

        if (igualIgual1 == igualIgual2) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        String iquals1 = "Norberto";
        String iquals2 = "Norberto";

        if (iquals1.equals(iquals2)) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        String iqualsIgCase1 = "Norberto";
        String iqualsIgCase2 = "NorberTo";

        if (iqualsIgCase1.equals(iqualsIgCase2)) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }


        String compare1 = "Norberto";
        String compare2 = "Norberto";

        if (compare1.compareTo(compare2) == 0) {
            System.out.println(compare1 + " e " + compare2 + " são iguais!");
        }
        if (compare1.compareTo(compare2) > 0) {
            System.out.println(compare1 + " é " + "maior que " + compare2);
        }
        if (compare1.compareTo(compare2) < 0) {
            System.out.println(compare2 + " é " + "maior que " + compare1);
        }

        String compareIgCase1 = "NorberTo Diman";
        String compareIgCase2 = "Norberto";

        if (compareIgCase1.compareToIgnoreCase(compareIgCase2) == 0) {
            System.out.println(compareIgCase1 + " e " + compareIgCase2 + " são iguais!");
        }
        if (compareIgCase1.compareToIgnoreCase(compareIgCase2) > 0) {
            System.out.println(compareIgCase1 + " é " + "maior que " + compareIgCase2);
        }
        if (compareIgCase1.compareToIgnoreCase(compareIgCase2) < 0) {
            System.out.println(compareIgCase2 + " é " + "maior que " + compareIgCase1);
        }

    }
}
