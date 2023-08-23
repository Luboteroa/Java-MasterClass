package String;

public class StringExample_Validate {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if(isNull)
        {
            course = "   ";
        }

        boolean isVoid = course.length() == 0;
        System.out.println("isVoid = " + isVoid);

        boolean isEmpty = course.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        
        boolean isBlank = course.isBlank();                     // The best one for validating
        System.out.println("isBlank = " + isBlank);

        if(!isVoid || !isEmpty)
        {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to the course ".concat(course));
        }
    }
}
