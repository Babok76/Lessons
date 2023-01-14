import java.util.Scanner;

public class DoWhile8 { //будет просить ввести цифру до тех пор пока не введем цифру 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }while(value!=5);

/*        System.out.println("Введи 5");
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }*/
        System.out.println("Вы ввели 5");
    }
}
