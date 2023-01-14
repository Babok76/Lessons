public class ClassesAndObjects14 { //public  - означает - главный класс; может быть только один
    public static void main(String[] args) { // класс - это шаблон, например homo sapiens, объект - это конкретный человек
        Person person1 = new Person();
        person1.name = "Рома";
        person1.age = 50;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 22;
        //person2.speak();

        //System.out.println("Меня зовут " + person1.name + " И мой возраст " + person1.age);
        //System.out.println("Меня зовут " + person2.name + " И мой возраст " + person2.age);

    }

    static class Person { // у класса могут быть :
        //            1. данные, поля (вес, пол, возраст...)
        //            2. Действия (методы) которые он может совершать (прыгать, бегать, учиться)
        String name;
        int age;

        void speak() { // метод, в отличие от класса всегда пишется с маленькой буквы
            for (int i = 0; i < 3; i++) {
                System.out.println("Меня зовут " + name + " И мой возраст " + age);
            }
        }

        void sayHello() {
            System.out.println("Привет");
        }
    }

}
