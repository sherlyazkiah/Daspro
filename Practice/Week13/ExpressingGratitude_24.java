package Week13;

import java.util.Scanner;

public class ExpressingGratitude_24 {
    public static String getGreetingRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(String additionalGreetings) {
        System.out.println("Additional Greetings: " + additionalGreetings);
    }

    public static void main(String[] args) {
        sayThankyou();
    }
}
