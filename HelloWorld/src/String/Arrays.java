package String;

public class Arrays {
    public static void main(String[] args) {
        String tongueTwister = "tonguetwister";

        System.out.println("tongueTwister.toCharArray() = " + tongueTwister.toCharArray());

        char[] array = tongueTwister.toCharArray();
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Array i= " +  i + " text: " + array[i]);
        }

        String spaceName = "Luis Carlos Botero Agudelo :D";
        String[] newSplitNameWithoutSpaces = spaceName.split(" ");
        for(int i=0; i<newSplitNameWithoutSpaces.length; i++)
        {
            System.out.print(newSplitNameWithoutSpaces[i]);                 // Printed without spaces 'cause we splited it
        }
    }
}
