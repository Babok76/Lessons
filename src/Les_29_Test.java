public class Les_29_Test {
    public static void main(String[] args) {
/*        Les_29_Animal an1 = new Les_29_Animal();
        Les_29_Dog dg1 = new Les_29_Dog();

        an1.eat();
        dg1.eat();*/

/*        Les_29_Animal an2 = new Les_29_Dog();
        an2.eat();*/

/*        Les_29_Dog dg2 = new Les_29_Dog();
        dg2.eat();
        dg2.bark();*/

        Les_29_Animal an3 = new Les_29_Animal(); //позднее связывание
        Les_29_Dog dg3 = new Les_29_Dog();
        Les_29_Cat ct1 = new Les_29_Cat();

        test(an3);
        test(dg3);
        test(ct1);


    }
    public static void test(Les_29_Animal an4) {
        an4.eat();
    }
}
