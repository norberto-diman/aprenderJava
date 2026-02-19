import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        Integer num = lista.get(0);
        System.out.println(num);

        lista.remove(1);

        for (Integer numero : lista) {
            System.out.println(numero);
        }
    }
}