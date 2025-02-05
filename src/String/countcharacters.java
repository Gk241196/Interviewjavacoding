package String;
public class countcharacters {
	    public static void main(String[] args) {
	    	String name="Ganesh Kumar";
	    	char[] ch=name.toCharArray();//count the characters
	    	int length1=ch.length;
	    	System.out.println("Number of characters in string " +length1);
	    	String[] ch1=name.split(" ");//count the words
	    	int words=ch1.length;
	    	System.out.println("Number of words in string " +words);
	    }
	}


