public class Les_21_Static {
    public static void main(String[] args) {
        Human3 h1 = new Human3("Bobi", 45);
        Human3 h2 = new Human3("Hrip", 56);
/*        Human3.description = "Testt1-2";
        h1.getAllDescription();
        h2.getAllDescription();
        //Human3.getDescription();
        Human3.description = "Tudi";
        h1.getAllDescription();
        h2.getAllDescription();
        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);*/
        h1.printNumberPeop();
        h2.printNumberPeop();

        Human3 h3 = new Human3("Dub", 67);
        h1.printNumberPeop();
        h2.printNumberPeop();
        h3.printNumberPeop();

    }
}

class Human3 {
    private String name;
    private int age;
    public static String description;
    public static int x;
    private static int countPep;

    public Human3 (String name, int age){
        System.out.println("Привет из Третьего");
        this.name=name;
        this.age=age;
        countPep++;
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
/*
    public static void getDescription() {
        System.out.println(description);
    }*/
    public void getAllDescription() {
        System.out.println(name+", "+age+", "+ description);
    }
    public void printNumberPeop () {
        System.out.println("Колво "+countPep);
    }
}