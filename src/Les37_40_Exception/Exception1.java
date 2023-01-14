package Les37_40_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
/*        File file = new File("test34");
        try {
            Scanner scan = new Scanner(file);
            System.out.println("После вканера");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            //e.printStackTrace();
        }
        System.out.println("После блока");*/

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Метод Main Ошибка");
            //e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Test34");
        Scanner scan = new Scanner(file);
    }
}
