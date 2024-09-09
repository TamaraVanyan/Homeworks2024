package SecondTask;

import java.util.Scanner;

public class EntertainmentVenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer's age:");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("Access denied. Minimum age is 16.");
            System.exit(2);
        }
        System.out.println("Is the customer a VIP? (true/false):");
        boolean isVip = scanner.nextBoolean();

        int entranceFee = 5000;

        System.out.println("Enter the amount for order: ");
        double orderAmount = scanner.nextDouble();
        if (isVip) {
            entranceFee = 0;  // I add this line following Davit's comment
            double discount = (orderAmount * 15)/100;
            orderAmount = orderAmount - discount;
        }
        double totalAmountSpent = entranceFee + orderAmount;

        System.out.println("Total amount spent by the customer: " + totalAmountSpent + " AMD");

        scanner.close();
    }
}