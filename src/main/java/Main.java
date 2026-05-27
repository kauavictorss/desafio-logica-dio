import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao = "s";

        System.out.println("=== Classificador de Nível de Herói ===");

        // Utiliza o laço de repetição para permitir múltiplas consultas
        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("\nDigite o nome do herói: ");
            String nome = scanner.next();

            System.out.print("Digite a quantidade de XP do herói: ");
            // Variável para armazenar o XP
            int xp;

            if (scanner.hasNextInt()) {
                xp = scanner.nextInt();
            } else {
                System.out.println("XP inválido! Por favor, insira um número inteiro.");
                scanner.next(); // Limpa o buffer
                continue;
            }

            // Estrutura de decisão para determinar o nível
            String nivel = classificarNivel(xp);

            // Saída formatada conforme o objetivo
            System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);

            System.out.print("\nDeseja classificar outro herói? (s/n): ");
            opcao = scanner.next();
        }

        System.out.println("Obrigado por usar o classificador!");
        scanner.close();
    }

    /**
     * Lógica de decisão para classificar o herói com base no XP.
     *
     * @param xp Quantidade de experiência.
     * @return O nível correspondente.
     */
    public static String classificarNivel(int xp) {
        if (xp < 1000) {
            return "Ferro";
        } else if (xp <= 2000) {
            return "Bronze";
        } else if (xp <= 5000) {
            return "Prata";
        } else if (xp <= 7000) {
            return "Ouro";
        } else if (xp <= 8000) {
            return "Platina";
        } else if (xp <= 9000) {
            return "Ascendente";
        } else if (xp <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }
}
