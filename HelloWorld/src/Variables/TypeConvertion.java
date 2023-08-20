package Variables;

public class TypeConvertion {
    public static void main(String[] args) {

        // From string to primitive

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98546.54e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // Now, from primitive to string

        int anotherIntNumber = 30;
        System.out.println(anotherIntNumber);

        String anotherStrNumber = Integer.toString(anotherIntNumber);
        System.out.println("anotherStrNumber = " + anotherStrNumber);
        
        // or
        
        String anotherStrNumber_2 = String.valueOf(anotherStrNumber);
        System.out.println("anotherStrNumber_2 = " + anotherStrNumber_2);

        // You can do this with double, float, long, etc.

        // Now, from primitive to primitive

        int i = 10000;
        short s = (short) i;
        long l = i;

        int n_i = (int)l;
    }
}
