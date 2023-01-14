package Les36_File_Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
/*        String separator = File.separator;
        String path = separator+"TestProg"+separator+"fileinput.txt"; // "/TestProg/FileInput.txt";

        File file = new File (path);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();*/

/*        String separator = File.separator;
        String path = separator + "TestProg" + separator + "FileInputOneLine.txt"; // "/TestProg/FileInput.txt";*/

        File file = new File("FileInJava");

        Scanner scan = new Scanner(file);
        String line1 = scan.nextLine();
        String[] numb = line1.split(" ");
        int[] numbers = new int[4];
        int counter = 0;

        for (String nummm : numb) {
            numbers[counter++] = Integer.parseInt(nummm);
        }

        System.out.println(Arrays.toString(numbers));
        scan.close();

    }
}
