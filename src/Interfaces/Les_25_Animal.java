package Interfaces;

public class Les_25_Animal implements Les_26_Info, Les_26_Info2{ // implements - реализует
    public int id;

    public Les_25_Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Спать in Package");
    }

    @Override
    public void showInfo() {
        System.out.println("ID это "+ id);

    }

    @Override
    public void showInfo2() {
        System.out.println("2ой id");

    }
}
