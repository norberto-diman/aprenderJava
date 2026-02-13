import java.util.Scanner;

public class Matematica {
    public void calcularTabuada() {
        Scanner valorUsuario = new Scanner(System.in);
        System.out.println("Digite um número para calcular tabuada: ");
        int n = valorUsuario.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
    }

    public void verificarParImpar() {
        Scanner valorUsuario = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é par um impar: ");
        int n = valorUsuario.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par!");
        } else {
            System.out.println("O número " + n + " é impar!");
        }
    }
    public void aplicarAumento() {
        Scanner valorUsuario = new Scanner(System.in);
        System.out.println("Digite o valor para aplicar o aumento: ");
        double valor = valorUsuario.nextDouble();
        System.out.println("Digite qual vai ser a % do aumento: ");
        double porcentagem = valorUsuario.nextDouble();

        double aumento = valor + (valor * (porcentagem / 100));

        System.out.println("O novo valor é: " + aumento);
    }
}
