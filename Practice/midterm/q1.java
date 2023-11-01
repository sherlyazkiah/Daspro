import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timeSolving, typeLanguage, workExperience;
        String name, graduated, major, passed;

        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Time of problem solving (minutes): ");
        timeSolving = input.nextInt();

        if (timeSolving <= 180) {
            System.out.print("Mastering of programming language: ");
            typeLanguage = input.nextInt();
            if (typeLanguage >= 3) {
                System.out.print("Graduated (D4 or S1): ");
                graduated = input.next();
                if (graduated.equalsIgnoreCase("D4") || graduated.equalsIgnoreCase("S1")) {
                    System.out.print("Major: ");
                    major = input.next();
                    if (major.equalsIgnoreCase("Teknik Informatika") || major.equalsIgnoreCase("Ilmu Komputer") || major.equalsIgnoreCase("Rekayasa Perangkat Lunak") || major.equalsIgnoreCase("Sistem Informasi")) {
                        System.out.print("Work experience: ");
                        workExperience = input.nextInt();
                        if (workExperience >= 1) {
                            System.out.print("Is she/he passed the interview? (y/n): ");
                            passed = input.next();
                            if (passed.equalsIgnoreCase("y")) {
                                System.out.println("Congratulations! You have passed the interview");
                            } else {
                                System.out.println("Sorry, you didn't pass the interview!");
                            }
                        } else {
                            System.out.println("Sorry, you didn't match the criteria!");
                        }
                    } else {
                        System.out.println("Sorry, you didn't match the criteria!");
                    }
                } else {
                    System.out.println("Sorry, you didn't match the criteria!");
                }
            } else {
                System.out.println("Sorry, you didn't match the criteria!");
            }
        } else {
            System.out.println("Sorry, you didn't match the criteria!");
        }
    }
}
