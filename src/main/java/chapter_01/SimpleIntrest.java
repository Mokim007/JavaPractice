package chapter_01;
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principleAmount=16500;
    	double intrest=7.5;
    	double time=3.5;
    	double calprinciple=(principleAmount*intrest*time)/100;
    	calprinciple+=calprinciple;
    	System.out.println("PrincipleAmount ->"+principleAmount);
    	System.out.println("Rate of intrest ->"+intrest);	
    	System.out.println("For time (period) ->" +time);
    	System.out.println("Total amount to be paid->"+calprinciple);
    
    	
	}
	
  }