package Les43_Vlogenye_Classes;

public class Test {
    public static void main(String[] args) {
        Electrocar ec1 = new Electrocar( 1);
        ec1.start();

        Electrocar.Battery b1 = new Electrocar.Battery();
        b1.charge();


    }
}
