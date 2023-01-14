package Les48_ENUM;

import Les41.Cat;

public class Test {
/*    private static final int DOG =0;
    private  static final int CAT = 1;
    private static  final int FROG =2;*/

    public static void main(String[] args) {
/*        int Animal = DOG;
switch (Animal) {
    case DOG:
        System.out.println("Собакен");
        break;
    case CAT:
        System.out.println("Кошара");
        break;
    default:
        System.out.println("Не животное");
}*/

        Animal an1 = Animal.CAT;
        System.out.println("1 " + an1.getTranslation());
        System.out.println("2 " + an1.toString());

        Animal an2 = Animal.DOG;
        System.out.println("3 " + an2);

        switch (an1) {
            case CAT:
                System.out.println("клошечка");
                break;
            case DOG:
                System.out.println("песель");
                break;
        }
//------------------------------------------------------------------------------------------------------------
        Season sn1 = Season.SUMMER;
// Object -> Enum -> Season
        System.out.println(sn1 instanceof Season);
        System.out.println(sn1.getClass());

        Season sn2 = Season.WINTER;
        System.out.println("4 " + sn2.getTemperature());

        switch (sn1) {
            case SPRING:
                System.out.println("Весна на улице");
                break;
            case SUMMER:
                System.out.println("Лето за окном");
                break;
        }
//--------------------------Полезные методы----------------------------------------------------------------
        Season sn3 = Season.SPRING;
        System.out.println("5 " + sn3.name()); //название ENum в виде строки

        Animal an3 = Animal.valueOf("FROG");
        System.out.println("6 " + an3.getTranslation());

        Season wn = Season.SPRING;
        System.out.println("7 " + wn.ordinal()); // вывод индекса ENUM

    }
}
