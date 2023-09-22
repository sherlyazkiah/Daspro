import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product;
        int qty;
        double price, total, pay, change;

        System.out.println("============== RECEIPT ==============");
        System.out.print("Product\t\t : ");
        product = sc.nextLine();
        System.out.print("Quantity\t : ");
        qty = sc.nextInt();
        System.out.print("Price\t\t : ");
        price = sc.nextDouble();
        total = qty*price;
        System.out.println("Total\t\t : " + total);
        System.out.print("Pay\t\t : ");
        pay = sc.nextDouble();
        change = pay - total;
        System.out.print("Change\t\t : " + change);
        System.out.println("\n======================================");
    }
}
