package Les47_Serialized_Transient_SerialUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person ps1 = new Person(1, "Mikle2");


        try (ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("WriteStringInFile"))) {


            oos.writeObject(ps1);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
