package Variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero.");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero. \nIntente nuevamente.");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("\n");

        String binaryResult = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(binaryResult);

        String octalResult = "Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(octalResult);

        String hexResult = "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(hexResult);

        String message = binaryResult;
        message += "\n" + octalResult;
        message += "\n" + hexResult;

        JOptionPane.showMessageDialog(null, message);
    }
}
