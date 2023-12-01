package Week13;

import java.util.Scanner;

public class WeeklyGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        System.out.print("Enter the number of weeks: ");
        int weeks = scanner.nextInt();

        int[][] grades = new int[weeks][students];
        input(grades);
        output(grades);
        int result[] = getMaxGrade(grades);
        System.out.println("Max grade "+result[0]+" located in week = "+result[1]);
    }
    static void input(int[][] data) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Input grades["+i+"]["+j+"] = ");
                data[i][j] = input.nextInt();
            }
        }
    }
    static void output(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("grades["+i+"]["+j+"] = "
                            +data[i][j]);
            }
        }
    }
    static int getWeekWithHighestGrade(int[][] data) {
        int highestWeek = 0;
        int maxGrade = data[0][0];

        for (int j = 0; j < data[0].length; j++) {
            int weekSum = 0;
            for (int i = 0; i < data.length; i++) {
                weekSum += data[i][j];
            }

            if (weekSum > maxGrade) {
                maxGrade = weekSum;
                highestWeek = j + 1;
            }
        }

        return highestWeek;
    }
    static int[] getMaxGrade(int[][] data) {
        int max = data[0][0];
        int week = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]>max) {
                    max = data[i][j];
                    week = j;
                }
            }
        }
        int[] result = {max,week+1};
        return result;
    }
}
