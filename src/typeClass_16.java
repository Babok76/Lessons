public class typeClass_16 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        //person1.name = "Ром";
        //person1.setName("Боб");
        String s1 = "Бочка";
        person1.setName(s1, 14 );

        //person1.age = 44;
/*        person1.threeTime();
        person1.sayHello();
        person1.calculate();
        int year1 = person1.calculate();*/
        person1.threeTime();

        Person2 person2 = new Person2();
        person2.name = "Нем";
        person2.age = 23;
/*        person2.threeTime();
        person2.sayHello();
        int year2 = person2.calculate();
        System.out.println("первому до пенсии: " + year1);
        System.out.println("второму до пенсии: " + year2);*/


    }
}

class Person2 {
    String name;
    int age;

    void setName(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculate() {
        int years = 65 - age;
        return years;
    }

    void threeTime() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Меня " + name + ", мне " + age);
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
