import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valorUser = new Scanner(System.in);
        ArrayList<Integer> listaNumero = new ArrayList<>();
        ArrayList<Integer> listaDeNumerosPares = new ArrayList<Integer>();
        ArrayList<Integer> listaDeNumerosImpares = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            Integer numero = valorUser.nextInt();
            listaNumero.add(numero);


        }

        for (Integer j : listaNumero) {
            if (j % 2 == 0) {
                listaDeNumerosPares.add(j);
            } else {
                listaDeNumerosImpares.add(j);
            }
        }

        System.out.println("Pares: " + listaDeNumerosPares);
        System.out.println("Impares: " + listaDeNumerosImpares);
    }
}