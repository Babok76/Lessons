public class Les_30_Data_Types {
    public static void main(String[] args) {
// int  -  32 бита = 4 байта
// short - 16 бит
        // byte - от -128 до 127
        //long - 64 бита
        //double - 64 бита  для хранения вещественных чисел
        //float - 32 бита  для хранения вещественных чисел

        float f = 123.2F; // - неявное переопределение с double на float
        long l = 122123L; // - неявное переопределение с int на long

        //int x = l; явное переопределение
        int x = (int)l;
        System.out.println(x);

        int a =123;
        double y = a;
        System.out.println(y);

        double xy = 123.6;
        long la = Math.round(xy);
        System.out.println("ddd "+ la);

    }
}
