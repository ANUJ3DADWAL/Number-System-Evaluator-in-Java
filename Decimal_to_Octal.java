package Number_System_Project;
import java.util.*;
public class Decimal_to_Octal {
	public static String deci_to_oct(int num) {
		int a=num;
		int answer=0;
		String b="";
		for(int i=1;i<=a;i++) {
			if(num/8==0) {
				b=num%8+b;
				break;
			}
			b=num%8+b;
			num=num/8;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();
		System.out.println(deci_to_oct(num));
		

	}

}
