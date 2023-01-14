package Les46_Serialized_Massive;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {
    public static void main(String[] args) {

        Person [] parray =  {new Person(1, "Ddddoba"), new Person(2, "Mom"), new Person(3, "Pupec")};

        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //------------------------------------------------------------------------------------------------------
/*            oos.writeInt(parray.length); // запись поэлементно
            for ( Person p3:parray) {
                oos.writeObject(p3);
            }*/
            //------------------------------------------------------------------------------------------------------
            oos.writeObject(parray); // запись объекта
            //------------------------------------------------------------------------------------------------------
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
