public class Les_31_Obertki_Primitivov {
    public static void main(String[] args) {
        int x = 1;  // - int это примитив
        System.out.println(x);

        //Double, Float, Long, Integer, Short, Byte, Character, Boolean - это обертки для примитива

        Integer x2 = new Integer(123); // так лучше не делать или делать в очень ограниченных случаях
        x2.doubleValue();
        System.out.println(x2);

        Integer x3 = new Integer(321); // так лучше не делать или делать в очень ограниченных случаях
        Integer.parseInt("123");

        Integer x4 = 333;  // Автоматическая упаковка примитива в класс Обертка
        int y = x4;  // Распаковка примитива


    }
}
