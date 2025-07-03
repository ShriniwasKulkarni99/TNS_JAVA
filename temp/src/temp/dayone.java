package temp;

public class dayone {
	//for even odd
	public static void evenodd(int num) {
		if(num%2==0) {
			System.err.println("Number "+num+" is even");
		}
		else {
			System.out.println("Number "+num+" is odd");
		}
	}
	//for voting
	public static void vote(int num) {
		if (num>18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
	}
	
	//for blood donation
	public static void blooddonate(int num) {
		if (num>18 && num<60) {
			System.out.println("Eligible to donate blood");
		}
		else {
			System.err.println("Not eligible");
		}
	}
	
	//for prime or not
	public static void prime(int num) {
		int f=1;
		if(num<=1) {
			f=1;
		}
		else {
			for (int i=2;i<num/2;i++) {
				if (num%i==0) {
					f=0;
				}
			}
		}
		
		if(f==1) {
			System.out.println("Number "+num+" is Prime");
		}
		else {
			System.err.println("Number "+num+" is not prime");
		}
		
	}
	
	
	
	public static void main(String args[]) {
		evenodd(10);
		vote(20);
		blooddonate(25);
		prime(7);
		prime(8);
			
	}

}
