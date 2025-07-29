package Home_work;

import java.time.Year;
import java.util.Scanner;

public class Calculate_a_person_age {
    public static void main(String[] args) {
        /*
        *Nhập năm sinh của một người. Tính tuổi người đó.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số năm sinh của bạn: ");
        int yearOfBirth = sc.nextInt();

        int age = Year.now().getValue() - yearOfBirth;
        System.out.println("Số tuổi của bạn là: " + age);
    }
}