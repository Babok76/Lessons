public class This_19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Увася");
        human1.setAge(77);
        human1.PrintHum ();

    }
}

class Human {
    String name;
    int age;

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
    public void PrintHum() {
        System.out.println(name+"..."+age);
    }


}