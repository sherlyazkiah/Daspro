import java.util.Scanner;

public class Selection2Exp224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;

        System.out.print("Input angle 1: ");
        angle1 = input24.nextInt();
        System.out.print("Input angle 2: ");
        angle2 = input24.nextInt();
        System.out.print("Input angle 3: ");
        angle3 = input24.nextInt();

        totalAngle = angle1+angle2+angle3;
        
        if(totalAngle == 180) 
            if(angle1==90 || angle2==90 || angle3==90)
                System.out.println("Right triangle");
            else
                System.out.println("Not a right triangle");
        else
            System.out.println("Not a triangle");
    }
}
