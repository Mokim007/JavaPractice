package chapter_01;

public class SwapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable(300,500);
		
	}
	static  void variable(int x, int y) {
		System.out.println("before swap");
		System.out.println("value x= "+x +" value of y="+y);
		
		 
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("after swap");
		System.out.println( "value of x=" +x+" value of y="+y);
		
		
		
	
}
}
