package BigNum;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNum1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入第一个数a:");
		BigDecimal a=scanner.nextBigDecimal();
		
		System.out.println("请输入第二个数b；");
		BigDecimal b=scanner.nextBigDecimal();
		
		BigDecimal c=a.add(b);
		
		System.out.println(c);		

	}

}
