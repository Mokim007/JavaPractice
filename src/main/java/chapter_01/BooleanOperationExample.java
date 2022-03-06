package chapter_01;

public class BooleanOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		
		flag=100>200;
		System.out.println("100>200  -> "+flag);
		flag=100<200;
		System.out.println("100<200  -> "+flag);
		flag=100==200;
		System.out.println("100==200  -> "+flag);
		flag=100>=200; // 100>200 or 100==200
		System.out.println("100>=200  -> "+flag);
		flag=100<=200;
		System.out.println("100<=200  -> "+flag);
		// 100==200 -Not false -> True -> ! True -> False
		flag=!(100==200);
		System.out.println("!(100==200)  -> "+flag);
		System.out.println("!flag ->"+!flag);
		flag=(100!=100);// 100==100 and 100!100 -> false
		System.out.println("100!=100  -> "+flag);
		flag=(200!=200);
		System.out.println("200!=200  -> "+flag);
		
		
		
	}

}
