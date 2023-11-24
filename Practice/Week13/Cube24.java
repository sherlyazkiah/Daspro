package Week13;

import java.util.Scanner;

public class Cube24 {
    static double calculateArea(int side) {
        double area = 0;
        area = 6*side*side;
        return area;
    }
    static double calculateVolume(int side) {
        double volume = 0;
        volume = side*side*side;
        return volume;
    }
    public static void main(String[] args) {
        double area = calculateArea(10);
        double volume = calculateVolume(10);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input side = ");
        int side = sc.nextInt();
        area = calculateArea(side);
        volume = calculateVolume(side);
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}
