package Practice;

import java.util.ArrayList;

public class Pr5_ArrayList_Massive {
    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<Integer>();

        for (int i=0; i< 5; i++){
            al1.add(i);

        }
        System.out.println(al1);


        ArrayList <String> al2 = new ArrayList<String>();
        for (int i=0; i<6; i++){
            al2.add(i+"Город");

        }
        al2.add(4, "Paris");
        al2.set(4, "Berlin");
        System.out.println(al2.size());
        //System.out.println(al2.get(7));
        System.out.println(al2.indexOf("Berlin"));
        System.out.println(al2);
    }
}
