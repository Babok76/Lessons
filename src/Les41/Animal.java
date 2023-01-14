package Les41;

public abstract class Animal { //не конкретный класс. От него нужно наследоваться.
    public void eat () {
        System.out.println("I am eating ...");
    }

    public abstract void makeSound();
}
