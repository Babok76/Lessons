package Practice;

import java.util.ArrayList;

//Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже.
//* * * * *
//* * * * *
//* * * * *
public class Pr6_Zvezdochki {
    public static void main(String[] args) {

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
