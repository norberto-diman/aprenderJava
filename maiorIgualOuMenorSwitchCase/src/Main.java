class Main {
    public static void main(String[] args) {
        int number = 75;
        int faixaValor;
        if(number < 51){
            faixaValor = 0;
        } else if (number < 101){
            faixaValor = 1;
        } else {
            faixaValor = 2;
        }
        switch (faixaValor) {
            case 0:
                System.out.println(number + " é menor ou igual a 50");
                break;
            case 1:
                System.out.println(number + " é maior que 50 e menor que 100");
                break;
            default:
                System.out.println(number + " é maior ou igual a 100");
                break;
        }
    }
}