package String;
public class Basicstring {
	public static void main(String args[]) {
	String name="Ganesh kumar";
	String uppercase=name.toUpperCase();//printing in upper case
	System.out.println("Given string in upper case as "+uppercase);
	String lowercase=name.toLowerCase();//printing in lower case
	System.out.println("Given string in lower case as "+lowercase);
	char ch2=name.charAt(5);//finding character using index
	System.out.println("Finding character is "+ch2);
	String Str="Ganesh";
	int index=Str.indexOf("Ganesh");
	System.out.println("Finding index is "+index);
	}
}


