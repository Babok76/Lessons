package Practice;
//Необходимо вывести на консоль такую последовательность чисел:
////1 2 4 8 16 32 64 128 256 512

public class Pr3_While2 {
    public static void main(String[] args) {
        //int x = 1;
/*        while (x<511){
             System.out.println(x);
            x*=2;

        }*/

/*        do{
            System.out.println(x);
            x*=2;
        } while (x<513);*/
        int x = umn1(1);
    }
    public static int umn1 (int x){
        System.out.println(x);
        if (x==512)
            return 512;
        return x=umn1(x*2);
    }
}
