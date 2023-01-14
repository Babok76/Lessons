public class Les_24_Object_ToString {
    public static void main(String[] args) {
        String string = "new String()";
        System.out.println(string);

        Human4 human = new Human4("Bob", 40);
        //human.toString();
        System.out.println(human);
    }

}

class Human4 {
    private String name;
    private int age;

    public Human4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +"..."+age;
    }
}