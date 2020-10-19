package donggoi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c = new Container();
		String number;
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap containernumber");
		number = sr.nextLine();
		c.setContainerNumber(number);
		System.out.println(c.getContainerNumber());
		
		
	}

}
