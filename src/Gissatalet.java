
import java.util.*;
import javax.swing.*;
import java.text.*;
public class Gissatalet {

    public static void main(String[] args) {
        Random rand = new Random();
        int tal = rand.nextInt(100);
        int a = 0;
        int gissningar = 0;

        while (a != tal) {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "gissa talet?"));
            gissningar++;
            if (tal > a)
                  JOptionPane.showMessageDialog(null, "du gissade för lågt" +a);

            else if (a > tal)
                    JOptionPane.showMessageDialog(null, "Du gissade för högt" +a);
            if (a == tal) {
                JOptionPane.showMessageDialog(null, "Du gissade rätt efter x antal gissnigar x =" +gissningar);
            }
        }



    }
}
