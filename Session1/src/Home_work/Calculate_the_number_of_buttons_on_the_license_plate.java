package Home_work;

import java.util.Scanner;

/*
*Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?
*Ví dụ: Biển số xe bạn là: 12345 thì số nút là 5, do 1 + 2+ 3 + 4 + 5 = 15, nhưng số nút chỉ lấy hàng đơn vị nên sẽ là 5 nút (điểm).
* */
public class Calculate_the_number_of_buttons_on_the_license_plate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter your vehicle number
        System.out.print("Enter your vehicle number (max 5 digits): ");
        int carNumber = sc.nextInt();

        int sum = carNumber % 10; //sum = 5
        carNumber = carNumber / 10;//carNumber = 1234

        sum = sum + carNumber % 10;//sum = 5 + 4 = 9
        carNumber = carNumber / 10;//carNumber = 123


        sum = sum + carNumber % 10;//sum = 9 + 3 = 12
        carNumber = carNumber / 10;//carNumber = 12


        sum = sum + carNumber % 10;//sum = 12 + 2 = 14
        carNumber = carNumber / 10;//carNumber = 1

        sum = sum + carNumber;//sum = 14 + 1 = 15
        //Calculate buttonNumber
        int buttonNumber = sum % 10;
        //print out license plate number
        System.out.println("carNumber: " + buttonNumber);

    }
}
