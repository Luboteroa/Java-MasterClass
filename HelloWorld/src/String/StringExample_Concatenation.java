package String;

public class StringExample_Concatenation {
    public static void main(String[] args) {
        String course = "Java Programming";
        String professor = "Luis Carlos Botero A.";

        String detail = course + " with the instructor " + professor;
        System.out.println(detail);
        System.out.println("\n");

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + "\n" + numberA + numberB); // It's not doing any addition, 'cause everything is a String
        System.out.println("\n");
        // Whe should use '()'
        System.out.println(detail + "\n" +(numberA + numberB));
        System.out.println("\n");
        // If we do the inverse process
        System.out.println(numberA + numberB + "\n" + detail); // Make the calculation from left to right
        System.out.println("\n");

        String detail2 = course.concat(" ").concat(professor);
        System.out.println("detail2 =\n" + detail2);
        System.out.println("\n");
    }
}
