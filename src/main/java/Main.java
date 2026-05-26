
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = somaArray(numeros);
        System.out.println("A soma dos números é: " + resultado);
    }

    public static int somaArray(int[] array) {
        int soma = 0;
        for (int numero : array) {
            soma += numero;
        }
        return soma;
    }
}