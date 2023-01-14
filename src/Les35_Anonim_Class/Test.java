package Les35_Anonim_Class;

public class Test {
    public static void main(String[] args) {
/*        Animal an1 = new Animal();
        an1.eat();

*//*        OtherAnimal an2 = new OtherAnimal();
        an2.eat();*//*

        Animal an2 = new Animal() {
            public void eat() {
                System.out.println("Other Animal из кушает..");
            }
        };
        an2.eat();*/
        AbleToEat an3 = new AbleToEat() {
            public void eat () {
                System.out.println("Asssss");
            }
        };
        an3.eat();
    }

}


interface AbleToEat {
    public void eat();
}

/*class Animal implements AbleToEat {

    @Override
    public void eat() {
        System.out.println("Asder");
    }
}*/

/*class Animal {
    public void eat() {
        System.out.println("Animal кушает ..");
    }

}*/

/*
class OtherAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("Other Animal из кушает..");
        //super.eat();
    }
}*/

