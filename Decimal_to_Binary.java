package Number_System_Project;
import java.util.*;
public class Decimal_to_Binary {
	public static String deci_to_bin(int num) {
		int a=num;
		String b="";
		for(int i=1;i<=a;i++) {
			if(num/2==0) {
				b=num%2+b;
				break;
			}
			b=num%2+b;
			num=num/2;
		}
		return b;
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();

		System.out.println(deci_to_bin(num));

	}

}
