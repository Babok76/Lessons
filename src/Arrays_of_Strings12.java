public class Arrays_of_Strings12 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] strings = new String[3];
        strings[0] = "привет ";
        strings[1] = "пока ";
        strings[2] = "java";
//        System.out.println(strings[0] + strings[1] + strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string : strings) {
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
            System.out.println(sum);
        }
        System.out.println();
        System.out.println(sum);
/*        for (int j = 0; j < numbers1.length; j++) {
            System.out.println(numbers1[j]);*/

        int value = 0;
        String s = null; // выделение памяти под ссылку
        String s1 = new String("edfdsfsdfs"); // выделение памяти под конкретную строку
        System.out.println(s);
    }
}
