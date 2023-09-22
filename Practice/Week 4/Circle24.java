import java.util.Scanner;

public class Circle24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double circumference, area;

        System.out.println("Input radius: ");
        r = input.nextInt();
        area = 3.14*r*r;
        circumference = 2*3.14*r;
        System.out.println("Area: " + area); 
        System.out.println("Circumference: " + circumference);
    }
}