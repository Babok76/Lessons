package Les49_Rekursia;

public class Test {
    public static void main(String[] args) {
        //someM();
        counter(3);

            }

/*    private static void someM() {
        System.out.println("Helllo!");
        someM();*/

    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);

        counter(n - 1);
    }
    //4! = 4*3*2*1
    //1! = 1
    //15! = 15*14*13*12*...*1
    //0!=1

}
