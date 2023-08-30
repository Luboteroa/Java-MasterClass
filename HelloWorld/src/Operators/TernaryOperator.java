package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "ITS TRUE" : "ITS FALSE";
        System.out.println("variable = " + variable);
        System.out.println("\n");

        String state = "";
        double average = 6.2;

        double mathematics = 0.0;
        double science = 0.0;
        double history = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mathematic note:");
        mathematics = scanner.nextDouble();
        System.out.println("Enter the science note:");
        science = scanner.nextDouble();
        System.out.println("Enter the history note:");
        history = scanner.nextDouble();

        average = (mathematics + science + history)/3;
        System.out.println("average = " + average);


        state = average >= 5.49 ? "APPROVED" : "REJECTED";
        System.out.println("state = " + state);

//        if(average >= 5.49)
//            state = "APPROVED";
//        else
//            state = "REJECTED";
    }
}
