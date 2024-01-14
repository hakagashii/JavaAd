import javax.swing.*;
import java.text.*;

/** The annual payment on a loan of principal, p (double), at annual interest rate, i (double), for a loan of duration of y (int) years is ......
 * Write an application that computes this formula for the appropriate program arguments.
 * -- Sq version: Pagesa vjetore për kredinë e principalit, p (double), me normë vjetore të interesit, i (double), për kredinë për y (int) vite është...
Shkruani aplikacionin që llogarit këtë formulë për argumentet e duhura të programit.
 */

public class DetyraA {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("0.00");

        // Pagesa për kredinë e principalit
        String kredia = JOptionPane.showInputDialog("Shkruani vlerën e kredisë, p.sh 25000: "); //perdoret për të shfaqur dialogun pas ekzekutimit 
        double p = new Double(kredia).doubleValue();

        // Norma vjetore e interesit
        String normaEInteresit = JOptionPane.showInputDialog("Shkruani normën vjetore të interesit, p.sh 6: ");
        double in = new Double(normaEInteresit).doubleValue();
        double i = in/100;

        // Numri i viteve në kredi
        String vitet = JOptionPane.showInputDialog("Shkruani numrin e viteve në kredi: ");
        int y = new Integer(vitet).intValue();

        // Kalkulimi i pagesës vjetore për kredi
        double payment = (Math.pow(1 + i, y) * p * i) /
                (Math.pow(1 + i, y) - 1);

        String message = "Pagesa për të dhënat e tilla si: \n"
                + "Kredia e marrur prej: " + formatter.format(p) + " euro\n"
                + "Norma vjetore e interesit: " + in + "%\n"
                + "Numri i viteve në kredi: " + y + "\n"
                + "Rezulton në pagesën vjetore me vlerë: " + formatter.format(payment) + " euro";
        JOptionPane.showMessageDialog(null, message);

        String Konfirmim = "Deshiron te vazhdosh per t'kalkuluar kredine e mbetur pas 0-5 viteve(shtyp ok per te vazhduar, shtyp x per te anuluar procesin.?: \n"; 
        JOptionPane.showMessageDialog(null, Konfirmim); //shfaq dialogun për konfirmim nëse personi deshiron të vazhdojë tutje per t'kalkuluar kredine e mbetur pas 0-5 viteve, nese po klikon ok, perkundrazi shtyp x ne dritare.
    
        /** Extend the application in the previous exercise so that it also prints the remaining debt for the Years 0 through 5 of the calculated loan.
         *  (p * Math.pow(z, n) - payment * (Math.pow(z, n) - 1) / (z - 1));
         * 
         * Duke ditur formulen më lartë, mund ta llogarisim borxhin e mbetur për kredi pas n vite të pageses, me formulen e lartëshkruar në EN.
         */



        //kredia e mbetur pas 0 viteve;
        double kredia0 = p * Math.pow(1 + i, 0) - payment * (Math.pow(1 + i, 0)- 1) / ((1 + i) - 1); //perdoret për të shfaqur dialogun pas ekzekutimit 
        JOptionPane.showMessageDialog(null, "Kredia e mbetur pas 0 vitesh është: " + formatter.format(kredia0) + " euro");

        //kredia e mbetur pas 1 viti;
        double kredia1 = (p * Math.pow(1 + i, 1) - payment * (Math.pow(1 + i, 1)- 1) / ((1 + i) - 1));
        JOptionPane.showMessageDialog(null, "Kredia e mbetur pas 1 viti është: " + formatter.format(kredia1) + " euro");

        // kredia e mbetur pas 2 viteve;
        double kredia2 = (p * Math.pow(1 + i, 2) - payment * (Math.pow(1 + i, 2)- 1) / ((1 + i) - 1));
        JOptionPane.showMessageDialog(null, "Kredia e mbetur pas 2 vitesh është: " + formatter.format(kredia2) + " euro");

        //kredia e mbetur pas 3 viteve;
        double kredia3 = (p * Math.pow(1 + i, 3) - payment * (Math.pow(1 + i, 3)- 1) / ((1 + i) - 1));
        JOptionPane.showMessageDialog(null, "Kredia e mbetur pas 3 vitesh është: " + formatter.format(kredia3) + " euro");

        //kredia e mbetur pas 4 viteve;
        double kredia4 = (p * Math.pow(1 + i, 4) - payment * (Math.pow(1 + i, 4)- 1) / ((1 + i) - 1));
        JOptionPane.showMessageDialog(null, "Kredia e mbetur pas 4 vitesh është: " + formatter.format(kredia4) + " euro");

        //kredia e mbetur pas 5 viteve;
        double kredia5 = (p * Math.pow(1 + i, 5) - payment * (Math.pow(1 + i, 5)- 1) / ((1 + i) - 1));
        JOptionPane.showMessageDialog(null, "Kredia e mbetur pas 5 vitesh është: " + formatter.format(kredia5) + " euro");

    }
}