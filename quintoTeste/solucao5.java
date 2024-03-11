package quintoTeste;

import java.util.Scanner;

public class solucao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma frase para deixar ela invertida: ");
        String originalString = scanner.nextLine();
        scanner.close();
        
        String reversedString = reverseString(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Reversed: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
}