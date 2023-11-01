import java.util.Scanner;

public class DoWhileLeaveEntitlement24 {
    public static void main(String[] args) {
    Scanner input24 = new Scanner(System.in);

    int leaveEntitlement, numLeave;
    String confirmation;

    System.out.print("Number of leave entitlement: ");
    leaveEntitlement = input24.nextInt();

    do {
        System.out.print("Do you want to take a leave? (y/n)? ");
        confirmation = input24.next();

        if (confirmation.equalsIgnoreCase("y")) {
            System.out.print("Leave number: ");
            numLeave = input24.nextInt();

            if (numLeave <= leaveEntitlement) {
                leaveEntitlement -= numLeave;
                System.out.println("The remaining leave entitlement: " + leaveEntitlement);
            } else {
                System.out.println("The remaining leave entitlement is not sufficient!");
                continue;
            }
        } else {
            break;
        }
    } while (leaveEntitlement > 0);
    }
}
