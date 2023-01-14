package Les43_Vlogenye_Classes;

public class Electrocar {
    private int id;
    private static int test;

    //Нестатический вложенный класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " запускается");
        }
    }

    //Статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Батарея заряжается ..." + test);
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor m1 = new Motor();
        m1.startMotor();
        System.out.println("Electrocar " + id + " is стартовал...");
        final int x =1;
        //Вложенный класс в методе
        class SomeClass {
            public void someMethod (){
                System.out.println("Вложение в метод: "+ id + x);
            }
        }
        SomeClass sm1 = new SomeClass();
        test(sm1);
    }

private void test (Object object){

}

}
