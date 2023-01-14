public class Arrays11 {
    public static void main(String[] args) {
        String s = new String("Hi");
        String s1 = "Hi22"; // ссылочный тип данных, так же как и массив. s1 - ссылка объект
        int[] numbers = new int[5]; // определение массива
/*numbers [0] =10;
numbers [1] = 15;
numbers [2] = 20;
numbers [3] = 25;
numbers [4] = 30;*/

//        int[] numbers1 = {1, 2, 3};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[3]);
    }
}
