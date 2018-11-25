package programs;

import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will reverse string array.");
        System.out.print("Enter your string whit regex ' ': ");
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        reverseArray(strings);

    }

    public static void reverseArray(String[] strings) {
        String temp = " ";
        for (int i = 0; i < strings.length; i++) {
            temp = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = temp;

            if (i == strings.length / 2) {
                break;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

}
