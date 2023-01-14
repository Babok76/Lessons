package Les44_Write_String_InFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("WriteStringInFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Строка 1");
        pw.println("Строка 2");

        pw.close();
    }
}
