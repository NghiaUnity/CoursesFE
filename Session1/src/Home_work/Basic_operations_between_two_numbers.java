package Home_work;

import java.util.Scanner;

public class Basic_operations_between_two_numbers {
    /*
     * Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng. Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.
     * Thực hiện các phép toán cơ bản (tổng, hiệu, tích, thương) giữa hai số nguyên.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();

        System.out.print("Enter integer b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (b != 0) {
            double quotient = (double) a / b;
            int remainder = a % b;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);

        } else {
            System.out.println("Cannot divide by zero.");
        }
        scanner.close();
    }
}