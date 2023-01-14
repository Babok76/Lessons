package Les46_Serialized_Massive;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadFromFile {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //------------------------------------------------------------------------------------------------------
/*            int persCount = ois.readInt();                // чтение поэлементно
            Person [] persarray = new Person[persCount];

            for (int i=0; i<persCount; i++){
                persarray[i] = (Person) ois.readObject();
            }*/
            //------------------------------------------------------------------------------------------------------
            Person[] persarray = (Person[]) ois.readObject();       //чтение объекта
            //------------------------------------------------------------------------------------------------------
            System.out.println(Arrays.toString(persarray));

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
