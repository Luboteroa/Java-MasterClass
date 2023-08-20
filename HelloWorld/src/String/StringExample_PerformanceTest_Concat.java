package String;

public class StringExample_PerformanceTest_Concat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        StringBuilder stringBuilder = new StringBuilder(a);
        String newA = "a";

        long init = System.currentTimeMillis();

        for(int i=0; i < 5000; i++)
        {
            //newA = newA.concat(a).concat(b).concat("\n");           // 500 -> 2 ms
            // newA+= a + b + "\n";                                   // 500 -> 11 ms
            stringBuilder.append(a).append(b).append("\n");           // 500 -> 0 ms
        }

        long end = System.currentTimeMillis();
        System.out.println(end - init);
        System.out.println("newA = " + newA);
        System.out.println("stringBuilder = " + stringBuilder.toString());
    }
}
