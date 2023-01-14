public class Les_32_Up_Down_Casting {
    public static void main(String[] args) {
        Les_29_Animal an = new Les_29_Animal();
        Les_29_Dog dog = new Les_29_Dog();

        //Upcasting  - восходящее преобразование. Из собаки делаем животное. Всегда безопасно. Так как наследуется.
        Les_29_Animal an2 = new Les_29_Dog();
        Les_29_Animal an3 = dog;

        //Downcasting - нисходящее преобразование. Из животного делаем собаку.Опасно.
        Les_29_Dog dog2 = (Les_29_Dog) an3;
        dog2.bark();

        Les_29_Animal a = new Les_29_Animal(); // работать не будет В классе Animal нет метода bark
        Les_29_Dog do3 = (Les_29_Dog) a;
        do3.bark();

    }
}
