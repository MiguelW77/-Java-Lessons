package For;

public class For11 {
    public static void main(String[] args) {
        System.out.println("Quadrados dos numeros de 1 a 10: ");
        for (int i = 1; i <= 10; i++) {
            int base = i;
            int expoente = 2;
            double resultado = Math.pow(base, expoente);

            System.out.println((int) resultado);
        }
    }
}
