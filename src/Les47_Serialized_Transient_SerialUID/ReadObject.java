package Les47_Serialized_Transient_SerialUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("WriteStringInFile"))) {


            Person ps1 = null;
            ps1 = (Person) ois.readObject();
            System.out.println(ps1);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
