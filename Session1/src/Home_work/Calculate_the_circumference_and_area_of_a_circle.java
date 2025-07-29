package Home_work;

/*
* Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
*Công thức
*Chu vi: C = 2 * π * r
*Diện tích: A = π * r²
 **/

import java.util.Scanner;

public class Calculate_the_circumference_and_area_of_a_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();

        // Calculate
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        // Output results
        System.out.printf("Circumference (C) = %.2f\n", circumference);
        System.out.printf("Area (A) = %.2f\n", area);

        sc.close();
    }
}