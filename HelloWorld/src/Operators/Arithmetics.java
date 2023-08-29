package Operators;

public class Arithmetics {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        int a = 4, b = 5;                           // I can do this on a single line

        System.out.println("(i+j) = " + (i+j));
        
        int suma = i+j;
        System.out.println("add = " + suma);
        
        int resta = i-j;
        System.out.println("subtraction = " + resta);

        int multi = i*j;
        System.out.println("multiplication = " + multi);
        
        int div = i/j;
        System.out.println("div = " + div);
        
        float div2 = (float)i/(float)j;
        System.out.println("div2 = " + div2);
        
        int rest = i%j;
        System.out.println("rest = " + rest);
    }
}
