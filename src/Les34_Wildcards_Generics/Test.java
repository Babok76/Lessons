package Les34_Wildcards_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal34> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal34(1));
        listOfAnimal.add(new Animal34(2));

        List<Dog34> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog34());
        listOfDogs.add(new Dog34());

        test(listOfAnimal);
        test(listOfDogs);

        Object obj1 = new Object();
    }

/*    private static void test(List<Animal34> list) {
        for (Animal34 animal : list) {
            System.out.println(animal);*/

        private static void test(List<? extends Animal34>  list) { // ? - обозначает возможность передачи полиморфизма;
            // extends - либо лист Animal34 либо другие наследники Animal34 (= Animal34 + Dog34) ,
            // super - либо лист Animal34 либо другие родители Animal34 (= Animal34 + Object)
/*            Object
               Animal34
                 Dog34*/
        for (Animal34 animal : list) {
            animal.eat();
        }
    }
}