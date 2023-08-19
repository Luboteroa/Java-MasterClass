public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en bytes a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        System.out.println("\n");

        double realDouble = 4028235E30d;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);
    }
}
