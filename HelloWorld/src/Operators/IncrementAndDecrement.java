package Operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        System.out.println("j = i++ = " + j);                   // Post decremento

        System.out.println("i = " + i);
        
        i = 1;
        System.out.println("i = " + i);
        
        int k = ++i;                                            // Pre dedcremento
        System.out.println("k = ++i =" + k);
        
        int l = 1;
        System.out.println("l = " + l);
        System.out.println("++l = " + ++l);
        System.out.println("l++ = " + l++);
        System.out.println("l = " + l);

        // Se puede usar con '--' también, por ejemplo:
        // int j = --i;
        // o
        // int j = j--;
    }
}
