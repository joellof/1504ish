import javax.swing.*;
import java.util.Scanner;

/**
 * Created by joellof on 2016-12-28.
 */
public class Test {
    public static void main(String[] args){

        boolean done = false;

        while(!done){

            String indata = JOptionPane.showInputDialog(null, "Ange startkapital, ränta och antal år: ");

            if(indata == null)
                done = true;

            else {

                Scanner s = new Scanner(indata);

                double k = s.nextDouble();
                double p = s.nextDouble();
                double year = s.nextDouble();

                if(k >= 0 && p > 0 && year > 0) {

                    double interest = increase(k, p, year);

                    interest = (double)Math.round(interest*100)/100 - k;
                    k = (double)Math.round(k*100)/100;
                    p = (double)Math.round(p*100)/100;
                    year = (double)Math.round(year*100)/100;

                    JOptionPane.showMessageDialog(null, k + " kronor kommer med en ränta på " + p + " procent att öka med " +
                            interest + " kr på " + year + " år.");
                }

                else
                    System.out.println("Invalid input!");

            }
        }
    }

    private static double increase(double capital, double rate, double year){

        double interest = capital * Math.pow((1 + rate/100), year);
        return interest;
    }
}
