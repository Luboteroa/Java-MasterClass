package String;

public class ArchiveExtension {
    public static void main(String[] args) {
        String archive = "some_image.jpg";
        int i = archive.lastIndexOf(".");
        System.out.println("archive.length() = " + archive.length());
        System.out.println("archive.substring(i+1) = " + archive.substring(i+1));
    }
}
