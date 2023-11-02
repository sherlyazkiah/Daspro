import java.util.Scanner;

public class ArrayGrade24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] finalGrade = new int[10];

        for (int i = 0; i < finalGrade.length; i++) {
            System.out.print("Input final grade "+i+" : ");
            finalGrade[i] = sc.nextInt();
        }

        for (int i = 0; i < finalGrade.length; i++) {
            if (finalGrade[i] > 70) {
                System.out.println("Student "+i+" is graduate");
            }
        }
    }
}
