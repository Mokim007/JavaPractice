package chapter_01;

public class SimpleInterestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double princpleAmount=500;
		double interest=5;
		double time=15;
		double calPrincipleAmount=(princpleAmount * interest * time) / 100;
		calPrincipleAmount+=princpleAmount;
		System.out.println("Principle amount ->"+princpleAmount);
		System.out.println("Rate of interest ->"+interest);
		System.out.println("For the time (Period) ->"+time);
		System.out.println("Total amount to be paid ->"+calPrincipleAmount);
	}

}
