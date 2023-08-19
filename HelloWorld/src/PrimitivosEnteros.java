public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte correspone en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte correspone en bits a: " + Byte.SIZE);
        System.out.println("Valor máximo de este es: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de este es: " + Byte.MIN_VALUE);

        System.out.println("\n");

        short numeroShort = 30000;
        System.out.println("Numero Short = " + numeroShort);
        System.out.println("Tipo short correspone en byte a: " + Short.BYTES);
        System.out.println("Tipo short correspone en bits a: " + Short.SIZE);
        System.out.println("Valor máximo de este es: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de este es: " + Short.MIN_VALUE);

        System.out.println("\n");

        int numeroInt = 2147483647;
        System.out.println("Numero Int = " + numeroInt);
        System.out.println("Tipo int correspone en byte a: " + Integer.BYTES);
        System.out.println("Tipo int correspone en bits a: " + Integer.SIZE);
        System.out.println("Valor máximo de este es: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de este es: " + Integer.MIN_VALUE);

        System.out.println("\n");

        long numeroLong = 9223372036854775807L;
        System.out.println("Numero Long = " + numeroLong);
        System.out.println("Tipo Long correspone en byte a: " + Long.BYTES);
        System.out.println("Tipo Long correspone en bits a: " + Long.SIZE);
        System.out.println("Valor máximo de este es: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de este es: " + Long.MIN_VALUE);
    }
}
