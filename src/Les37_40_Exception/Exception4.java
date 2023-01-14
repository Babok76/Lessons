package Les37_40_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public void main(String[] args) {
/*        try {
            try {
                run();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
//-----------------------------------------------------------------------------------------------------
/*            try
    {
        run();
    } catch(ParseException |
    IOException e)
    {
        e.printStackTrace();
    }
}*/
//-------------------------------------------------------------------------------------------------------
        try {
            run();
        } catch (Exception e) {

        } //catch (ParseException p) { // наследуется от Exception поэтому никогда не выкинется

        }

        public void run () throws IOException, ParseException, IllegalArgumentException {


        }

    }
