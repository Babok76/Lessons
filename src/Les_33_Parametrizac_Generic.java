import java.util.ArrayList;
import java.util.List;

public class Les_33_Parametrizac_Generic {
    public static void main(String[] args) {
        ////////////////////Java 5////////////////////////
        List animals = new ArrayList();
        // list.add();
        Les_29_Animal ouranim = new Les_29_Animal();
        Anumal our1 = new Anumal();
        animals.add("cats");
        animals.add("dogs");
        animals.add("frogs");
        animals.add(ouranim);
        animals.add(our1);

        System.out.println(animals);

        String anim1 = (String) animals.get(1); //animals наследуется от object. Соответственно тоже object. Делаем downCasting.
        System.out.println(anim1);

        //////////////////Java c появлением Параметризации//////////////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cats2");
        animals2.add("dogs2");
        animals2.add("frogs2");

        String anim2 = animals2.get(2);
        System.out.println(anim2);


        //////////////Сейчас////////////////
        List<String> animal3 = new ArrayList<>();
        animal3.add("cats2");
        animal3.add("dogs2");
        animal3.add("frogs2");

        String anim3 = animal3.get(1);
        System.out.println(anim3);

    }
}
class Anumal {

}