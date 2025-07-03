package temp;

public class demo {
	
	public static void pattern(int ro, int col){
		for(int i=0;i<ro; i++) {
			for(int j=0;j<col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		pattern(5,5);
	}

}
