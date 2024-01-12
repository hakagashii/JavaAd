import javax.swing.*;

import java.text.DecimalFormat;


public class AnnualPaymentOfPrincipal {
    public static void main(String[] args) {
        // Scanner me marr inputin


        // Norma vjetore e interesit 
        String normaEInteresit = JOptionPane.showInputDialog("Shkruaj normen vjetore te interesit, p.sh: 7.4 : ");
        double in = new Double(normaEInteresit).doubleValue();
        double i = in / 100;

        // Numrin e vjeteve 
        String vitet = JOptionPane.showInputDialog("Shkruaj numrin e viteve, si numer të plotë, p.sh 5 : ");
        int y = new Integer(vitet).intValue();

        // Pagesa vjetore per kredi
        String kredia = JOptionPane.showInputDialog("Shkruaj vleren e kredise, p.sh 25000 : ");
        double krediaAll = new Double(kredia).doubleValue();
        double p = krediaAll / y ;
        

        double numruesi = Math.pow(1 + i,y) * p * 1;
        double emruesi = Math.pow(1 + i,y) - 1;
        double pagesa = numruesi / emruesi;
        DecimalFormat formatter = new DecimalFormat("0.0"); 
    
        String message = "Pagesa per te dhenat e tilla si:\n"
                + "Pagesa vjetore per kredi: " + p + "\n"
                + "Norma vjetore e interesit: " + i +"\n"
                + "Numri i viteve në kredi: " + y +"\n"
                + "Rezulton në pagesën me vlerë: " + formatter.format(pagesa);

                JOptionPane.showMessageDialog(null, message, "Ekzekutimi i pageses", JOptionPane.INFORMATION_MESSAGE); 

    }
}
