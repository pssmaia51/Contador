package contador;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite;

        // Entrada do limite
        System.out.print("Digite o valor limite: ");
        try {
            limite = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida! O valor precisa ser um número inteiro.");
            return;
        }

        // Contagem de 0 até o limite
        for (int i = 0; i <= limite; i++) {
            System.out.println("Contador: " + i);
        }

        scanner.close();
    }
}

