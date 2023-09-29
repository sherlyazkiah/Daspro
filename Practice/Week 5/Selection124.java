import java.util.Scanner;

public class Selection124 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number = input24.nextInt();

        // Ternary Operator
        // syntax (condition) ? (statement for true) : (statement for false)
        String result = (number %2==0) ? " is an even number!" : " is an odd number!";
        System.out.println(number + result);

    //    if(number %2 == 0){
    //        System.out.println(number + " is an even number!");
    //    } else {
    //        System.out.println(number + " is an odd number!");
    //    }
    }
}