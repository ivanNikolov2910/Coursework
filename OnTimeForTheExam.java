package programs;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello user. To be sure when you must to arrive for your exam you can use this program.");
        System.out.print("Enter the hour when the exam start: ");
        int examHours = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the minutes when the exam start: ");
        int examMin = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the hour when you think to arrive: ");
        int arriveHour = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the minutes when you think to arrive: ");
        int arriveMIn = Integer.parseInt(scanner.nextLine());
        int examTime = (examHours * 60) + examMin;
        int arriveTime = (arriveHour * 60) + arriveMIn;
        int minutesDifference = examTime - arriveTime;
        String message, time = "";
        if (minutesDifference > 30) {
            message = "early";
        } else if (minutesDifference <= 30) {
            message = "on time";
        } else {
            message = "late";
        }
        if (minutesDifference != 0) {
            int hours = Math.abs(minutesDifference / 60);
            int minutes = Math.abs(minutesDifference % 60);
            if (hours > 0) {
                time = String.format("%d:%02d hours", hours, minutes);
            } else {
                time = minutes + " minutes";
            }
            if (minutesDifference > 0) {
                time += " before the start";
            } else {
                time += " after the start";
            }
        }
        System.out.println("You will arrive " + message + ".");
        System.out.println(time + ".");
    }
}