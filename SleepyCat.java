package programs;

import java.util.Scanner;

public class SleepyCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many free days will have the cat's owner: ");
        int freeDays = Integer.parseInt(scanner.nextLine());
        final int dayInYear = 365, isWorkMin = 63, isHolidayMin = 127, normForSleep = 30000;
        int workDays = dayInYear - freeDays;
        int minuteForPlay = (workDays * isWorkMin) + (freeDays * isHolidayMin);
        int different = normForSleep - minuteForPlay;
        int hours = Math.abs(different / 60);
        int minutes = Math.abs(different % 60);
        if (different < 0) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}