package String;
public class Basicstring {
    public static void main(String argg[]) {
        String name = "Ganesh kumar";
        System.out.println("Given string in upper case as " + name.toUpperCase());
        System.out.println("Given string in lower case as " + name.toLowerCase());
        System.out.println("Finding character is " + name.charAt(5));
        System.out.println("Finding index is " + name.indexOf("Ganesh"));
        System.out.println("Substring from index 0 to 6 is " + name.substring(0, 6));
        System.out.println("Replacing 'kumar' with 'KUMAR' gives " + name.replace("kumar", "KUMAR"));
        System.out.println("Length of the string is " + name.length());
    }
}


