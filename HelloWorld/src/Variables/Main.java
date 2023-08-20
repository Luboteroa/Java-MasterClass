package Variables;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String saludar = "Hola mundo desde Java";

        System.out.printf(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;    // Primitive        // Primitive = Class && Not primitive != class or object
        Integer numero2 = 5; // Not primitive
        System.out.println(numero);

        var numero3oStringoLoQueYoQuiera = 1; // "15", '2', 1.2, true
    }
}