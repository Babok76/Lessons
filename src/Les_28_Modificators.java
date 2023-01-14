import L28Pack1.Person;

public class Les_28_Modificators extends Person {
    public int id;

    public static void main(String[] args) {
        //public (класс, метод, поле),
        // private (виден в пределах класса декларации), класс не может быть приватным
        // default (модификатор доступа в пакете, доступно в пределах пакета),
        // protected(доступны в пределах пакета и вне пакета (для всех подклассов)) класс не может быть протектед
        Person p1 = new Person();
        p1.name = "Name";
        System.out.println(Person.CONSTANT);

    }

    public Les_28_Modificators() {
        System.out.println(name1);
    }
}

