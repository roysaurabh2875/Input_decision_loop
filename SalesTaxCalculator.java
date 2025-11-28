import java.util.*;

public class SalesTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int SENTINEL = -1;
        double price, actualPrice, salesTax;
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;

        System.out.print("Enter the tax-inclusive price  (or -1 to end): ");
        price = sc.nextDouble();

        while (price != SENTINEL) {
            actualPrice = price *0.93;
            salesTax = price * 0.07;

            System.out.printf("ACtual price is :%.2f%n", actualPrice);
            System.out.printf("SAles tax is :%.2f%n", salesTax);

            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;
            totalPrice += price;

            System.out.print("Enter the tax-inclusive price s (or -1 to end): ");
            price = sc.nextDouble();

        }
        
        System.out.printf("Total actual price is :%.2f%n", totalActualPrice);
        System.out.printf("Total sales tax is : %.2f%n", totalSalesTax);
        System.out.printf("Total price is :%.2f%n", totalPrice);

    }
}
