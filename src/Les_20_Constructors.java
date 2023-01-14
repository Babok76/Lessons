public class Les_20_Constructors {
    public static void main(String[] args) {
        Human2 human1 = new Human2();
        human1.setName("Бизон");
        human1.setAge(14);
        String s1 = "123";
        int s2 = 15;

        Human2 human2 = new Human2("df");
    }
}

class Human2 {



    private String name;
    private int age;

    public Human2(){ // Конструктор по умолчанию
        this.name = "По умолчанию";
        this.age = 0;
        System.out.println(name+"..."+age);
    }
    public Human2(String name){
        System.out.println("Привет из 2");
        this.name=name;}

    public Human2 (String name, int age){
        System.out.println("Привет из Третьего");
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}