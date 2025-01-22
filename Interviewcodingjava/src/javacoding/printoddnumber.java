//print prime number
package javacoding;
public class printoddnumber {
		public static void prime() {
			for(int i=0;i<10;i++) {
				if(i%2!=0)
					System.out.println(i);
			}
		}
	public static void even() {
		for(int i=0;i<10;i++) {
			if(i%2==0)
		System.out.println(i);
	}	
	}
	public static void main(String[] args) {
		//printoddnumber obj=new printoddnumber();
		printoddnumber.prime();
		printoddnumber.even();
	}
	}
