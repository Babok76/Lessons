public class GetterSetter_18 {
    public static void main(String[] args) {

        Person3 person1 = new Person3();
        String s1 = "";
        int a1= 22;

        person1.setName(s1);
        person1.setAge(a1);

        person1.threeTime();
        int a2 = person1.calculateAge();
        System.out.println("До пенсии " + a2);

        System.out.println(person1.getName() +"..."+ person1.getAge());

    }
}

class Person3 {
    private String name;
    private int age;

/*    void setName(String usname, int usage) {
        name = usname;
        age = usage;
    }*/

    public void setName(String usname) {
        if (usname.isEmpty()
        ) {
            System.out.println("ты ввел пустое значение");
        } else {
            name = usname;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int usage) {
        if (usage < 0) {
            System.out.println("Ты ввел отрицалово !");
        }else {
            age = usage;
        }

    }

    public int getAge() {
        return age;
    }

    int calculateAge() {
        int newAge = 65 - age;
        return newAge;
    }

    void threeTime() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Мое имя " + name + " Мне " + age);
        }
    }
}