import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean f = false;
        int c = 0;
        int s = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;     //2147483647

        for (; ; ) {
            int p = scanner.nextInt();

            if (p == -1) {
                break;
            }

            c++;
            s += p;

            if (p>9) {
                f = true;
            }
            if (p > max) {
                max = p;
            }
            if (p < min) {
                min = p;
            }
        }
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
        System.out.println(max);
        System.out.println(min);
    }

}

// 2 3 4 10 4   -1