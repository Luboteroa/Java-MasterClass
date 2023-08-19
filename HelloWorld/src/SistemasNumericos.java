public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("\n");

        //Ahora directamente como binario
        int numeroBinario = 0b111110100;
        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("\n");

        //Octal
        int numeroOctal = 0764;
        System.out.println("Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("\n");

        //Hexadecimal
        int numeroHexadecimal = 0x1f4;
        System.out.println("Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        System.out.println("\n");
    }
}
