import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Massiv {
    public void array () {
        List<String> examples = new ArrayList<String>();
        boolean go = true;
        do {
            Scanner sc = new Scanner(System.in);
            String line = sc.next();
            if (line.equalsIgnoreCase("exit")){
                go = false;
                break;
            }
            System.out.println(line);
        }while()


    }
}
