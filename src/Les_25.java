public class Les_25 {
    public static void main(String[] args) {
        Human5 h1 = new Human5("Bibi", 56);
        System.out.println(h1.toString());

        Les_25_Animal animal = new Les_25_Animal();
        animal.eat();
        animal.sleep();

        Les_25_Dog dog = new Les_25_Dog();
        dog.eat();
        dog.sleep();
        dog.lai();
        dog.showName();
    }
}

class Human5 {
    private String name;
    private int age;

    public Human5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString (){
        return name +"-"+ age;
    }
}
