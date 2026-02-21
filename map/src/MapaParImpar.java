import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mapaNumero = new HashMap<>();
        Map<Integer, Integer> mapaNumerosPares = new HashMap<>();
        Map<Integer, Integer> mapaNumerosImpares = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            Integer numero = sc.nextInt();
            mapaNumero.put(i, numero);
        }

        for (Integer chave : mapaNumero.keySet()) {
            if (mapaNumero.get(chave) % 2 == 0) {
                mapaNumerosPares.put(chave, mapaNumero.get(chave));
            } else {
                mapaNumerosImpares.put(chave, mapaNumero.get(chave));
            }
        }

        for (Integer chave : mapaNumerosPares.keySet()) {
            System.out.println("Valor da chave: " + chave + "=" + mapaNumerosPares.get(chave) + " é par!");
        }
        for (Integer chave : mapaNumerosImpares.keySet()) {
            System.out.println("Valor da chave: " + chave + "=" + mapaNumerosImpares.get(chave) + " é impar!");
        }
    }
}