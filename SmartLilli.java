package programs;

import java.util.Scanner;

public class SmartLilli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how old is Lilli: ");
        int yearNow = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter price for washing machine: ");
        double priceForWashingMachine = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter price for one toy: ");
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int moneyForBirthday = 0;
        int savedMoney = 0;
        int toysCount = 0;

        for (int currentYear = 1; currentYear <= yearNow; currentYear++) {
            if (currentYear % 2 == 0) {
                moneyForBirthday += 10;
                savedMoney += moneyForBirthday - 1;
            } else {
                toysCount++;
            }
        }
        savedMoney += toyPrice * toysCount;
        if (savedMoney >= priceForWashingMachine) {
            System.out.printf("Yes! %.2f", savedMoney - priceForWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceForWashingMachine - savedMoney);
        }
    }
}
