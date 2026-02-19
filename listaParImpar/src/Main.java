import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valorUser = new Scanner(System.in);
        ArrayList<Integer> listaDeNumerosPares = new ArrayList<Integer>();
        ArrayList<Integer> listaDeNumerosImpares = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            Integer numero = valorUser.nextInt();

            if (numero % 2 == 0) {
                listaDeNumerosPares.add(numero);
            } else {
                listaDeNumerosImpares.add(numero);
            }

        }

        System.out.println("Pares: " + listaDeNumerosPares);
        System.out.println("Impares: " + listaDeNumerosImpares);
    }
}