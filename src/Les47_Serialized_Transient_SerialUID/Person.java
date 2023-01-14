package Les47_Serialized_Transient_SerialUID;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -1331702554413238682L;

    private  int id;
    private String personName;
    private int age;
    private byte type;

    public Person (int id, String name) {
        this.id = id;
        this.personName = name;
    }
    public int getId () {
        return id;
    }
    public  String getName () {
        return personName;
    }
    public String toString(){
        return id + " : " + personName;
    }
}
