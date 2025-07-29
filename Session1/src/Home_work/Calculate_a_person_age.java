package Home_work;

import java.time.Year;
import java.util.Scanner;
import static java.time.Year.now;

public class Calculate_a_person_age {
    public static void main(String[] args) {
        /*
        *Nhập năm sinh của một người. Tính tuổi người đó.
        */


        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số năm sinh của bạn: ");
        int namSinh = sc.nextInt();

        int tinhTuoi = Year.now().getValue() - namSinh;
        System.out.println("Số tuổi của bạn là: " + tinhTuoi);
    }

}
