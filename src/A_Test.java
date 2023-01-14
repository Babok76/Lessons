import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A_Test {
    public static void main(String[] args) {

/*        int[] init = {2, 4, 6, 2, 1, 4, 6};

        Arrays.stream(init)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .forEach((key, value) -> {
                    if (value.size() % 2 != 0) System.out.println(key);
                });*/

/*        int i = 0;
        int[] mas;
        mas=new int[] {2, 4, 6, 2, 1, 4, 6, 5, 6};

        Arrays.sort(mas); //Arrays - идет в комплекте с java, позволяет творить всякие штуки с массивами, в данном случае просто сортирует (можете ознакомиться в интернете с остальными методами, вдруг что понадобится, а вы уже знаете где искать)

        while (i < mas.length) //проходим по нашему отсортированному массиву
        {
            if (i == mas.length-1) {
                //этот if сработает только на последнем элементе и выйдет из цикла, предохраняет от выхода за
                //пределы массива, т.к. далее в коде стоит mas[i+1]
                System.out.println(mas[i++]); //выведет последний элемент (i++ можно просто i, без разницы, по привычке написал)
                break; //покинет цикл
            }
            if (mas[i] == mas[i+1]) i+=2; //эта штука проверяет, имеет ли текущий элемент пару (массив отсортирован,
                //значит если пара есть, то она как раз в следующем элементе массива
                //при этом i+=2 значит, что найдена пара и мы ее пропускаем
            else System.out.println(mas[i++]);
            //если пара не найдена - выводим текущий элемент и переходим к следующему }*/

/*
        public class FindDuplicate {
            private static void findDuplicate(List<Integer> elements) {
//находим сумму всех уникальных элементов списка
                int distinctSum = elements.stream().distinct().mapToInt(e -> e).sum();
//находим сумму всех элементов списка
                int totalSum = elements.stream().mapToInt(e -> e).sum();
                System.out.println("Элемент, который повторяется : " + (totalSum - distinctSum));
            }

            public static void main(String[] args) {
//создаем список последовательных элементов на промежутке [1..101).
                List <Integer> elements = IntStream.range(1, 101).boxed().collect(Collectors.toList());
//устанавливаем элементу с индексом 53 значение 23
                elements.set(53, 23);
                findDuplicate(elements);
            }
        }
*/


    }
}
