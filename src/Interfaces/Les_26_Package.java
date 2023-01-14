package Interfaces;

public class Les_26_Package {
    public static void main(String[] args) {
        Les_25_Animal animal = new Les_25_Animal(13);
        Person p1 = new Person("Persik");
        animal.sleep();
        p1.sayHello();
        p1.showInfo();
        animal.showInfo();
        p1.showInfo2();
        animal.showInfo2();

        Les_26_Info info1= new Les_25_Animal(11);
        Les_26_Info info2 = new Person("dsdff");

        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);

        outputInfo(animal);
        outputInfo(p1);

    }

    public static void outputInfo (Les_26_Info info){
        info.showInfo();
    }

}
