/*
 * @Name: Gruhith Yerramalli   
 * @Date: 10/18/2022
 * @Description: This program will be used to take input from a scanner and will take your credit card number and pin and create a receipt of what you have bought from this "virtual store".
 */
import java.util.Scanner;
import java.util.UUID;
public class ComputerPartsPurchase {
    public static String randomOrder () {
        UUID orderNumber = UUID.randomUUID();
        String newOrder = orderNumber.toString();
        String firstFive = newOrder.substring(0, 5);
        return firstFive;
    }
    public static void main (String []  args) {
        System.out.println("Welcome to Micro Center! Here you can purchase PC parts and laptops.");
        
        Scanner userInfo = new Scanner(System.in);

        System.out.print("Enter Your First and Last Name: ");
        String Name = userInfo.nextLine();
        while (Name == "") {
            System.out.print("Enter Your First and Last Name: ");
            Name = userInfo.nextLine();
        }

        System.out.print("Enter Today's Date (mm/dd/yyyy): ");
        String Date = userInfo.nextLine();
        while (Date == "") {
            System.out.print("Enter Today's Date (mm/dd/yyyy): ");
            Date = userInfo.nextLine();
        }

        System.out.print("What Computer Part or Computer would you like to buy?: ");
        String Part = userInfo.nextLine();
        while (Part == "") {
            System.out.print("What Computer Part or Computer would you like to buy?: ");
            Part = userInfo.nextLine();
        }

        System.out.print("What is the price of this item? (US Dollars): ");
        Double Price = userInfo.nextDouble();

        System.out.print("What is the quantity of this product?: ");
        int quantity = userInfo.nextInt();

        System.out.println("");
        String CardType = userInfo.nextLine();

        System.out.print("Are You using Debit or Credit Card?: ");
        String cardTypeTwo = userInfo.nextLine();
        while (cardTypeTwo == "") {
            System.out.print("Are You using Debit or Credit Card?: ");
            cardTypeTwo = userInfo.nextLine();
        }

        System.out.print("Enter your " + cardTypeTwo +  " Card Number (####-####-####-####): ");
        String cardNumber = userInfo.nextLine();
        while (cardNumber == "") {
            System.out.print("Enter your " + cardTypeTwo +  " Card Number (####-####-####-####): ");
            cardNumber = userInfo.nextLine();
        }
        
        System.out.print("Enter your PIN (####): ");
        String Pin = userInfo.nextLine();
        while (Pin == "") {
            System.out.print("Enter your PIN (####): ");
            Pin = userInfo.nextLine();
        }

        Double finalPrice = Price * quantity;

        userInfo.close();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("Receipt");
        
        String newDate = Date.replace("/", "-");
        System.out.println("");
        
        System.out.println(newDate);
        System.out.println("Order Number: " + randomOrder());
        System.out.println("");

        String newName = Name.substring(0, 1) + ".";
        String lastName = Name.substring(Name.indexOf(' ') + 1);
        System.out.println(newName + " " + lastName);

        String lastCardNumbers = cardNumber.substring(15);
        System.out.println("####-####-####-" + lastCardNumbers);
        System.out.println("Product: " + Part);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + Price);
        System.out.println("");
        System.out.println("$" + finalPrice + " Will Be " + cardTypeTwo + "ed To Your Account.");

        System.out.println("");
        System.out.println("Thank You For Shopping With Us!");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        
        System.exit(0);
    }
}
