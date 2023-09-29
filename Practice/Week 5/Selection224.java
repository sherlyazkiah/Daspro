import java.util.Scanner;

public class Selection224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Final Exam  : ");
        float finalExam = input24.nextFloat();
        System.out.print("Mid Exam    : ");
        float midExam = input24.nextFloat();
        System.out.print("Quiz        : ");
        float quiz = input24.nextFloat();
        System.out.print("Assignment  : ");
        float assignment = input24.nextFloat();

        float finalGrade = (finalExam*0.4F) + (midExam*0.3F) + (quiz*0.1F) + (assignment*0.2F);
        String message = finalGrade < 65 ? "Retake" : "Pass";
        System.out.println("Final Grade = " + finalGrade + " and the decision is " + message);

        if(finalGrade>80 && finalGrade<=100){
            System.out.println("The final grade is A");
        } else if(finalGrade>73 && finalGrade<=80){
            System.out.println("The final grade is B+");
        } else if(finalGrade>65 && finalGrade<=73){
            System.out.println("The final grade is B");
        } else if(finalGrade>60 && finalGrade<=65){
            System.out.println("The final grade is C+");
        } else if(finalGrade>50 && finalGrade<=60){
            System.out.println("The final grade is C");
        } else if(finalGrade>39 && finalGrade<=50){
            System.out.println("The final grade is D");
        } else if(finalGrade<=39 ){
            System.out.println("The final grade is E");
        } else {
            System.out.println("Error");
        } 
    }
}
