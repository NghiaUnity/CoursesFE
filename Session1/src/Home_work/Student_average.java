package Home_work;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student_average {
    /*
    * Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh. Tính điểm trung bình của học sinh đó.
    * Tính điểm trung bình cho một học sinh dựa trên điểm thi và hệ số của ba môn Toán, Lý, Hóa.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter test scores
        System.out.print("Enter Math score: ");
        double mathScore = sc.nextDouble();

        System.out.print("Enter Physics score: ");
        double physicsScore = sc.nextDouble();

        System.out.print("Enter Chemistry score: ");
        double chemistryScore = sc.nextDouble();

        // Enter weight coefficients
        System.out.print("Enter Math weight: ");
        int mathWeight = sc.nextInt();

        System.out.print("Enter Physics weight: ");
        int physicsWeight = sc.nextInt();

        System.out.print("Enter Chemistry weight: ");
        int chemistryWeight = sc.nextInt();

        // Calculate weighted total and average
        double weightedTotal = (mathScore * mathWeight) + (physicsScore * physicsWeight) + (chemistryScore * chemistryWeight);
        int totalWeight = mathWeight + physicsWeight + chemistryWeight;
        double averageScore = weightedTotal / totalWeight;

        // Output result
        System.out.printf("The student's average score is: %.2f\n", averageScore);

        sc.close();
    }
}