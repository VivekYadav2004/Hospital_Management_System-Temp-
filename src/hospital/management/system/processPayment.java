package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class processPayment extends JFrame {





        private static Scanner scanner = new Scanner(System.in);

//public static void main(String[] args) {
        //      processPayment();
        //}


        public static void processPayment() {



                System.out.println("Enter payment amount:");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Select payment method (1: Credit Card, 2: Debit Card, 3: PayPal):");
                int paymentMethod = scanner.nextInt();
                scanner.nextLine();

                switch (paymentMethod) {
                    case 1:
                        processCreditCardPayment(amount);
                        break;
                    //  case 2:
                    //  processDebitCardPayment(amount);
                    //    break;
                    case 3:
                        processPayPalPayment(amount);
                        break;
                    default:
                        System.out.println("Invalid payment method selected.");
                        break;
                }


            }

        private static void processCreditCardPayment ( double amount){
            System.out.println("Enter credit card number:");
            String cardNumber = scanner.nextLine();
            System.out.println("Enter expiry date (MM/YY):");
            String expiryDate = scanner.nextLine();
            System.out.println("Enter CVV:");
            String cvv = scanner.nextLine();

            System.out.println("Processing credit card payment of $" + amount + "...");
            System.out.println("Payment successful!");
        }

   /* private static void processDebit কার্ডPayment(double amount) {
        System.out.println("Enter debit card number:");
        String cardNumber = scanner.nextLine();
        System.out.println("Enter expiry date (MM/YY):");
        String expiryDate = scanner.nextLine();
        System.out.println("Enter CVV:");
        String cvv = scanner.nextLine();

        System.out.println("Processing debit card payment of $" + amount + "...");
        System.out.println("Payment successful!");
    }
*/
    private static void processPayPalPayment ( double amount){
            System.out.println("Enter PayPal email:");
            String email = scanner.nextLine();
            System.out.println("Enter PayPal password:");
            String password = scanner.nextLine();

            System.out.println("Processing PayPal payment of $" + amount + "...");
            System.out.println("Payment successful!");
        }

    public static void main(String[] args) {
        processPayment();
    }
}
