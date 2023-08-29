package Operators;

public class Assignation {
    public static void main(String[] args) {
        int i = 5;              // This '=' is the truly assignation. We've been using this on the entire course.
        int j = i+4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        i += 2;                 // i = i+2;
        System.out.println("New i = " + i);

        j -= 4;                 // j = j-4;
        System.out.println("j = " + j);

        // We can do this whichever arithmetic operator (+,-,*, /, %)

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Andres'";
        sqlString += " and c.activo = 1";
        System.out.println("sqlString = " + sqlString);
    }
}
