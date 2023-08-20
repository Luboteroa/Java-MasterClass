package String;

public class StringExample_Inmutable {
    public static void main(String[] args) {
        String course = "Java Programming";
        String professor = "Luis Carlos Botero A.";

        String result = course.concat(professor);
        System.out.println("result = " + result);

        String result2 = course.transform(c ->
        {
            return c + " with " +  professor;
        });
        System.out.println("result2 = " + result2);

        String result3 = result.replace("a", "A");
        System.out.println("result3 = " + result3);
    }
}
