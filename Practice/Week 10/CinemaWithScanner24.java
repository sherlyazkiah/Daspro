import java.util.Scanner;

public class CinemaWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column, choice;
        String name, next;
        String[][] audience = new String[4][2];
        
        while (true) {
            // display menu
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            choice = sc.nextInt();

            sc.nextLine();

            if (choice == 1) {
                while (true) {
                    System.out.print("Enter a name: ");
                    name = sc.nextLine();
                    System.out.print("Enter row number: ");
                    row = sc.nextInt();
                    System.out.print("Enter column number: ");
                    column = sc.nextInt();
                    sc.nextLine(); 

                    // to handle if the seat row/column number is not available
                    if (audience[row - 1][column - 1] != null) {
                        System.out.println("Warning! Seat already occupied by " + audience[row - 1][column - 1] + ". Choose another seat.");
                        continue;
                    }

                    audience[row - 1][column - 1] = name;
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (choice == 2) {
                for (int i = 0; i < audience.length; i++) {
                    System.out.print("Audience in the row " + (i + 1) + ": ");
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] != null) {
                            System.out.print(audience[i][j]);
                        } else {
                            System.out.print("***");
                        }
                        if (j < audience[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (choice == 3) {
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter 1/2/3.");
            }
        }
    }
}