//print even and odd sum
package javacoding;
public class printevenoddsum {
	public static void evensum() {
		int sum=0;
		for(int i=1;i<=300;i++){
			if(i%2==0) {
				sum++;
			}
		}
			System.out.println(sum);	
		}
	public static void oddsum() {
		int sum1=0;
		for(int i=1;i<=90;i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
				System.out.println(sum1);
			}
public static void main(String args[]){
           printevenoddsum.evensum();
           printevenoddsum.oddsum();
}
}

