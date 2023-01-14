public class Break_Continue9 {
 /*   public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            i++;
            System.out.println(i);
        }
        System.out.println("мы вышли ИЗ Цикла");
    }*/

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {  //Остаток от деления
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }
    }
}
