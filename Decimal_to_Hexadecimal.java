package Number_System_Project;
import java.util.*;
public class Decimal_to_Hexadecimal {
	public static String deci_to_hex(int num) {
		int a=num;
		String answer="";
		for(int i=0;i<=a;i++) {
			if(num%16>9 && num/16==0) {
				answer=(char)((num%16)+65-10)+answer;
				break;
			}
			else if(num%16>9 && num/16!=0) {
				answer=(char)((num%16)+65-10)+answer;
				num=num/16;
				
			}
			else if(num/16==0 && num%16<10) {
				answer=num%16+answer;
				num=num/16;
				break;
				
			}
			else {
				answer=num%16+answer;
				num=num/16;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();
		System.out.println(deci_to_hex(num));
	}

}
