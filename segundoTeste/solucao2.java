package segundoTeste;

import java.util.Scanner;

public class solucao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;
        int sum = 0;

        while (sum < number) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum == number;
    }
}

