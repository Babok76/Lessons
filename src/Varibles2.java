public class Varibles2 {
    public static void main (String [] args) {
/*       int myInt; // резервируем память. int - 32 битное число
        myInt = 557; // инициализируем переменную*/
        // Целочисленные данные
        int myInt = 558;
        short myShort =  559; // short 16 битное число (-32000 до 32000)
        long myLong = 560; //64 битное число

        // Вещественные данные
        double myDouble = 235.34; //64 битное число. Число с точкой - всегда по умолчанию - double
        float myFloat = 2362.4f;   //32 битное число. f на конце иначе double

        //Символьные данные
        char с = 'a';
        boolean b = true;
        byte myByte =  100; // числа от -127 до 127

        System.out.println(myInt);
    }
}
