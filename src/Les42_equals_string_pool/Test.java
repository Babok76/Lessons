package Les42_equals_string_pool;

public class Test {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        System.out.println(x==y); // сравнение

        Animal an1 = new Animal(1);
        Animal an2 = new Animal(1);
        System.out.println(an1==an2);
        System.out.println(an1.equals(an2));

        String st1 = new String("Hello1");
        String st2 = new String("Hello1");
        //st1 = "Hello1";
        //st2 = "Hello1";

        System.out.println(st1.equals(st2));
        System.out.println(st1==st2);

        String a = "hi";
        String b = "hi123".substring(0,2);
        System.out.println(a==b);

            }
}

class Animal {
    private int id;

    public Animal (int id) {
        this.id = id;
    }
    public boolean equals (Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id== otherAnimal.id;
    }
}