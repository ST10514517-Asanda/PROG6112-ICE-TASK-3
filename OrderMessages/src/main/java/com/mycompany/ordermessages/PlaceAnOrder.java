/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordermessages;
import java.util.Scanner;
/**
 *
 * @author asand
 */
public class PlaceAnOrder {
   
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int[] validItems = {111, 222, 333, 444};
    double[] prices = {0.89, 1.47, 2.43, 5.99};

    int itemNumber = 0;
    int quantity = 0;
    double itemPrice = 0.0;
    boolean isValidItem = false;

try { // Adapted from: W3Schools
      // Reference: https://www.w3schools.com/java/java_try_catch.asp
        System.out.print("Enter item number: ");
        String itemStr = scanner.nextLine();

try { // Adapted from: W3Schools
      // Reference: https://www.w3schools.com/java/java_try_catch.asp
        itemNumber = Integer.parseInt(itemStr); // Adapted from: GeeksforGeeks
                                                // Reference: https://www.geeksforgeeks.org/integer-parseint-method-in-java/
}
catch (NumberFormatException e) {
throw new OrderException(OrderMessages.MESSAGES[0]);
}

if (itemNumber < 0) {
throw new OrderException(OrderMessages.MESSAGES[1]);
}

if (itemNumber > 9999) {
throw new OrderException(OrderMessages.MESSAGES[2]);
}

for (int i = 0; i < validItems.length; i++) {

if (itemNumber == validItems[i]) {
        isValidItem = true;
        itemPrice = prices[i];
break;
}
}

if (!isValidItem) {
throw new OrderException(OrderMessages.MESSAGES[6]);
}

        System.out.print("Enter Quantity: ");
        String qtyStr = scanner.nextLine();

try { // Adapted from: W3Schools
      // Reference: https://www.w3schools.com/java/java_try_catch.asp
        quantity = Integer.parseInt(qtyStr); // Adapted from: GeeksforGeeks
                                             // Reference: https://www.geeksforgeeks.org/integer-parseint-method-in-java/
}
catch (NumberFormatException e) {
throw new OrderException(OrderMessages.MESSAGES[3]);
}

if (quantity < 1) {
throw new OrderException(OrderMessages.MESSAGES[4]);
}

if (quantity > 12) {
throw new OrderException(OrderMessages.MESSAGES[5]);
}

    double totalDue = itemPrice * quantity;
        System.out.printf("Order successful! You ordered %d of item #%d.%n", quantity, itemNumber); // Adapted from: W3Schools
                                                                                                    // Reference: https://www.w3schools.com/java/ref_output_printf.asp
        System.out.printf("Total amount due: $%.2f%n", totalDue); // Adapted from: W3Schools
                                                                  // Reference: https://www.w3schools.com/java/ref_output_printf.asp
}
catch (OrderException e) {
        System.out.println("\nOrder Error: " + e.getMessage());
}
finally {
        scanner.close();
}
}
}