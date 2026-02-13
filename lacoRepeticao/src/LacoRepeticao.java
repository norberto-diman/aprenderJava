import java.util.Arrays;
import java.util.List;

public class LacoRepeticao {
    public void executaForNormal() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i:" + i);
        }
    }

    public void executaForEach() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer n : numeros) {
            System.out.println("Número: " + n);
        }
    }
}
