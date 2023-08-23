package String;

import javax.lang.model.SourceVersion;

public class MostImportantMethods {
    public static void main(String[] args) {
        String name = "Kbozz";

        System.out.println("name.length() = " + name.length());
        // A string is an array of characters (char)
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        System.out.println("name.equals(\"Kbozz\") = " + name.equals("Kbozz"));
        System.out.println("name.equals(\"kbozz\") = " + name.equals("kbozz"));
        System.out.println("name.equalsIgnoreCase(\"KBOZZ\") = " + name.equalsIgnoreCase("KBOZZ"));
        System.out.println("name.compareTo(\"Karlos\") = " + name.compareTo("Karlos"));

        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(4) = " + name.charAt(2));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        System.out.println("name.substring(2) = " + name.substring(2));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
        System.out.println("name.substring(name.length()-2) = " + name.substring(name.length()-2));

        String tongueTwister = "tonguetwister";
        System.out.println("tongueTwister.replace(\"T\", \".\") = " + tongueTwister.replace("t", "."));
        System.out.println("tongueTwister.indexOf(\"e\") = " + tongueTwister.indexOf("e"));
        System.out.println("tongueTwister.lastIndexOf(\"t\") = " + tongueTwister.lastIndexOf("t"));
        
        String replaceSpace = "Luis  Carlos  Botero Agudelo XD";
        System.out.println("replaceSpace.replace(\" \", \"\\b\") = " + replaceSpace.replace(" ", ""));
        System.out.println("replaceSpace.replace(\" \", \"\\b\") = " + replaceSpace.replace(" ", "\b"));
    }
}
