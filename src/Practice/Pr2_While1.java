package Practice;
//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98

public class Pr2_While1 {
    public static void main(String[] args) {
        int x = 0;
/*        do {
            x = x + 7;
            System.out.println(x);
        } while (x < 97);*/

        while (x < 99) {
            System.out.println(x);
            x=x+7;
        }
    }
}
