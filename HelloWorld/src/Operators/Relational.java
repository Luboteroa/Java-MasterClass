package Operators;

public class Relational {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);
        
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);
    }
}
