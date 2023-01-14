package Les41;

public class Abstract {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        DogInt dog2 = new DogInt();
        //Animal anim1 = new Animal();  // - концепция - не сущность

        cat1.makeSound();
        dog1.makeSound();
        cat1.eat();
        dog1.eat();

        dog2.makeSoundInt();
    }


}
