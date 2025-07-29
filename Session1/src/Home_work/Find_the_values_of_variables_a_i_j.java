package Home_work;
/*
* /**
 * Tìm a, i, j biết:
 * a.    int i = 1, j = 1;
 * int a = i++ + j++;
 * b.    int i = 1, j = 1;
 * int a = i++ + ++j;
 * c.    int i = 1, j = 1;
 * int a = ++i + j++;
 * d.    int i = 1, j = 1;
 * a = ++i + ++j;
 * e.    int i = 1, j = 1;
 * int a = i++ + j++ + i++ + j++;
 * f.    int i = 1, j = 1;
 * int a = ++i + ++j + i++ + j++;
 * g.    int i = 1;
 * int a = i++ + ++i - i-- - --i;
 * h.    int a = 10;
 * a += a++ + ++a;
 */
public class Find_the_values_of_variables_a_i_j {
    public static void main(String[] args) {
        //i++ dùng rồi mới tăng
        //++i tăng rồi mới tăng
        //i-- dùng rồi mới giảm
        //--i giảm rồi mới dùng
        // a
        int i = 1, j = 1;
        int a = i++ + j++;
        System.out.println("a. a = " + a + ", i = " + i + ", j = " + j);

        // b
        i = 1; j = 1;
        a = i++ + ++j;
        System.out.println("b. a = " + a + ", i = " + i + ", j = " + j);

        // c
        i = 1; j = 1;
        a = ++i + j++;
        System.out.println("c. a = " + a + ", i = " + i + ", j = " + j);

        // d
        i = 1; j = 1;
        a = ++i + ++j;
        System.out.println("d. a = " + a + ", i = " + i + ", j = " + j);

        // e
        i = 1; j = 1;
        a = i++ + j++ + i++ + j++;
        System.out.println("e. a = " + a + ", i = " + i + ", j = " + j);

        // f
        i = 1; j = 1;
        a = ++i + ++j + i++ + j++;
        System.out.println("f. a = " + a + ", i = " + i + ", j = " + j);

        // g
        i = 1;
        a = i++ + ++i - i-- - --i;
        System.out.println("g. a = " + a + ", i = " + i);

        // h
        a = 10;
        a += a++ + ++a;
        System.out.println("h. a = " + a);
    }
}
