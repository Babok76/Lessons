import java.util.Scanner;

public class Switch10 { //похож на оператор if, но используется, когда есть много условий, которые нужно перебрать
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи возраст");
        int age = scanner.nextInt(); //можно использовать строковую переемнную String age = scanner.nextLine()
        switch (age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ничего не выполнилось");
        }
    }
}
