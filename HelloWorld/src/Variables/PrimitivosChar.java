package Variables;

public class PrimitivosChar {
    public static void main(String[] args) {
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        
        char decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("decimal = caracter: " + (decimal==caracter));
    }
}
