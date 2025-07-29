package Home_work;

import java.util.Scanner;

public class Calculate_the_price_and_added_value_of_the_product {
    /*
    * Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
    * a. tiền = số lượng * đơn giá
    * b. thuế giá trị gia tăng = 10%
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter unit price ($): ");
        double unitPrice = scanner.nextDouble();

        // Calculate price and VAT
        double totalPrice = quantity * unitPrice;
        double vat = totalPrice * 0.10;
        double totalWithTax = totalPrice + vat;

        System.out.println("\n--- Invoice ---");
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("VAT (10%): $" + vat);
        System.out.println("Total (including VAT): $" + totalWithTax);

        scanner.close();
    }
}
