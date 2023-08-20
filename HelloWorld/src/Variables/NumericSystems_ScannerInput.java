package Variables;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericSystems_ScannerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero.");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();          // Integer.parseInt(numeroStr);
        }catch (InputMismatchException e)
        {
            System.out.println("Error. ¡Debe ingresar un número entero! \nIntente nuevamente.");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("\n");

        String binaryResult = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String octalResult = "Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String hexResult = "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String message = binaryResult;
        message += "\n" + octalResult;
        message += "\n" + hexResult;

        System.out.println(message);
    }
}
