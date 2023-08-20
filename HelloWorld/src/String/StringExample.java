package String;

public class StringExample {
    public static void main(String[] args) {
        String course = "Java Programming";
        String course2 = new String("Java Programming");
        String course3 = "java programming";
        
        boolean isEqual = (course == course2);
        System.out.println("course == course2 = " + isEqual);

        isEqual = course.equals(course2);
        System.out.println("course.equals(course2) = " + isEqual);

        isEqual = course.equals(course3);
        System.out.println("course.equals(course3) = " + isEqual);

        isEqual = course.equalsIgnoreCase(course3);
        System.out.println("course.equalsIgnoreCase(course3) = " + isEqual);
    }
}
