package String;

import java.util.Scanner;

public class Work_NameHandler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        String finalString = "";
        for(int i=0; i<names.length; i++)
        {
            System.out.println("Introduzca un nombre: ");
            names[i] = scanner.nextLine();

            String firstCapitalWord = String.valueOf(names[i].charAt(1));
            String subString = names[i].substring(names[i].length()-2);

            names[i] = firstCapitalWord.toUpperCase() + "." + subString.toLowerCase();
            System.out.println("Name = " + names[i] + "\n");

            if(i<names.length-1)
                finalString = finalString.concat(names[i]) + "_";
            else
                finalString = finalString.concat(names[i]);
        }

        System.out.println("\nFinal Result: " +  finalString);
    }
}
