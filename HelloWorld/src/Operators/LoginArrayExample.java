package Operators;

import java.util.Scanner;

public class LoginArrayExample {
    public static void main(String[] args) {
//        String[] usernames = new String[3];
//        String[] passwords = new String[usernames.length];
//
//        usernames[0] = "Luis";
//        passwords[0] = "12345";
//
//        usernames[1] = "Carlos";
//        passwords[1] = "los09los";
//
//        usernames[2] = "Alberto";
//        passwords[2] = "ElMejorPapa";

        String[] usernames = {"Luis", "Carlos", "Alberto"};
        String[] passwords = {"12345", "los09los", "ElMejorPapa"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the username");
        String username_in = scanner.next();

        System.out.println("Enter the password");
        String password_in = scanner.next();

        boolean isAuthenticated = false;

        for(int i = 0; i<usernames.length; i++)
        {
            if(usernames[i].equals(username_in) && passwords[i].equals(password_in))
            {
                isAuthenticated = true;
                break;
            }
        }

        if(isAuthenticated)
            System.out.println("Welcome user ".concat(username_in).concat("!"));
        else
            System.out.println("Sorry, bad authentication. Please verify your credentials");
    }
}
