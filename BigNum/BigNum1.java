package BigNum;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNum1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�������һ����a:");
		BigDecimal a=scanner.nextBigDecimal();
		
		System.out.println("������ڶ�����b��");
		BigDecimal b=scanner.nextBigDecimal();
		
		BigDecimal c=a.add(b);
		
		System.out.println(c);		

	}

}
