package Interfaces;

public class Person implements Les_26_Info, Les_26_Info2 { // implements - реализует
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Say Hello");
    }


    @Override
    public void showInfo() {
        System.out.println("Имя это "+ name);
    }

    public void showInfo2(){
        System.out.println("2ое имя");
    }
}
