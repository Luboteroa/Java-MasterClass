package Variables;

import javax.swing.*;

public class Work2_FactureDetail {
    public static void main(String[] args) {
        String entryMsg = "Please enter your facture detail";
        String exceptionMsg = "You must add an integer number! \nPlease try again.";
        String succesMsg = "Succes! \nYour facture detail is: ";

        String entryInput = JOptionPane.showInputDialog(null, entryMsg);
        int numInput = 0;

        try{
            numInput = Integer.parseInt(entryInput);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, exceptionMsg);
            main(args);
            System.exit(0);
        }

        succesMsg += numInput;
        JOptionPane.showMessageDialog(null, succesMsg);
    }
}
