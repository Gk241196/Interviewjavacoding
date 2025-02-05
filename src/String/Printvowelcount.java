package String;
public class Printvowelcount {
	public static void main(String args[]) {
	String name="Ganeshkumar learning";
	int vowels=0;
	for(int i=0;i<name.length();i++) {
		char ch=name.toLowerCase().charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels++;
		}
	}
		System.out.println(vowels);
	}	
}

