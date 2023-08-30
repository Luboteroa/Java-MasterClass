package Operators;

import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        String username = "LuisCarlos";
        String password = "los09losXD";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the username");
        String username_in = scanner.next();

        System.out.println("Enter the password");
        String password_in = scanner.next();

        boolean isAuthenticated = false;

        if(username.equals(username_in) && password.equals(password_in))
            isAuthenticated = true;
        else
            System.out.println("Username or password incorrect");

        if(isAuthenticated)
            System.out.println("Welcome user ".concat(username).concat("!"));
        else
            System.out.println("Sorry, bad authentication");
    }
}
