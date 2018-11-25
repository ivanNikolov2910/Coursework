package programs;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will calculate how much time and" +
                           " how many tiles you will need to repair this area.");
        System.out.print("First enter length of the area: ");
        int sideLength = Integer.parseInt(scanner.nextLine());
        System.out.print("Now enter tile's width: ");
        double tileW = Double.parseDouble(scanner.nextLine());
        System.out.print("And tile's length: ");
        double tileL = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter bench's width: ");
        int benchW = Integer.parseInt(scanner.nextLine());
        System.out.print("And length: ");
        int benchL = Integer.parseInt(scanner.nextLine());
        int area = sideLength * sideLength;
        int benchArea = benchL * benchW;
        double tilesSize = tileL * tileW;
        int areaToRepair = area - benchArea;
        double tilesCount = areaToRepair / tilesSize;
        double time = tilesCount * 0.2;
        System.out.printf("You need %.2f tiles to repair this area.\n", tilesCount);
        System.out.printf("The area will be ready for about %.2f minutes.", time);
    }
}




