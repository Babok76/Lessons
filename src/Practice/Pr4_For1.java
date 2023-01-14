package Practice;

import java.util.Arrays;

//Необходимо перебрать все элементы массива и вывести в консоль.
public class Pr4_For1 {
    public static void main(String[] args) {
        //int [] x = new int[5];
        int [] x = {1,2,3};
/*        for (int i=0; i<x.length; i++){
            x[i]=i;
            System.out.println(Arrays.toString(x));
        }*/
        for (int i:x){                                          //Это конструкция foreach
            System.out.println(i);
            System.out.println(Arrays.toString(x));
            //System.out.println(x[i]);
        }


    }
}
