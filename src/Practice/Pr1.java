package Practice;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Integer[] mas1 = new Integer[5];
        Scanner sc1 = new Scanner(System.in);

        int n = sc1.nextInt();
        System.out.println(umn(n));
    }

    public static int umn(int n) {
        if (n == 1)
            return 1;
        return n + umn(n - 1);
    }
}
