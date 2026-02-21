import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> mapa = new HashMap<>();

        mapa.put(50, 0);
        mapa.put(200, 2);
        mapa.put(400, 4);

        Integer numeroSolto = mapa.get(50);
        System.out.println("Número solto: " + numeroSolto);

        for (Integer chave : mapa.keySet()) {
            System.out.println("Valor da chave: " + chave + "=" + mapa.get(chave));
        }
    }
}
