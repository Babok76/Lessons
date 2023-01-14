package Les45_Serialized_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Boba");
        Person p2 = new Person(2, "Mom");

        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);
            oos.writeObject(p2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
