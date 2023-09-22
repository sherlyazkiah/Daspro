import java.util.Scanner;

public class Circle24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double phi=3.14, circumference, area;

        System.out.println("Input radius: ");
        r = input.nextInt();
        area = phi*r*r;
        circumference = 2*phi*r;
        System.out.println("Area: " + area); 
        System.out.println("Circumference: " + circumference);
    }
}