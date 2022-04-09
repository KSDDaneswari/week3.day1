package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("The axisbank depsoit is 10%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank axis = new AxisBank();
		
		axis.deposit();
		axis.saving();
		axis.fixed();

	}

}
