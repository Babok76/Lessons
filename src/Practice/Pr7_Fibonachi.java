package Practice;
// Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
//первый и второй члены последовательности равны единицам
//а каждый следующий — сумме двух предыдущих
//То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.

public class Pr7_Fibonachi {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (int n = 3; n < 12; n++) {
            int m = i + j;
            i = j;
            j = m;

            System.out.println(m);
        }
    }
}
