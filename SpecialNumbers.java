package programs;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to see which are its special numbers: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = i / 1000;
            if (a == 0 || b == 0 || c == 0 || d == 0) {
                continue;
            } else if (num % a == 0 && num % b == 0 && num % c == 0 && num % d == 0) {
                System.out.printf("%d%d%d%d ", d, c, b, a);
            }
        }
    }
}
