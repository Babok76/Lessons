package Les49_Rekursia;

public class Test2 {
    public static void main(String[] args) {
        //4! = 4*3*2*1
        //1! = 1
        //15! = 15*14*13*12*...*1
        //0!=1
        System.out.println(faci(4));

    }

    public static int faci (int n){
        if (n==1)
            return 1;
        return n*faci(n-1);
    }
}
