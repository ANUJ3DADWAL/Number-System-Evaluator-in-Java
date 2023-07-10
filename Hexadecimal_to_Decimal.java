package Number_System_Project;
import java.util.*;
public class Hexadecimal_to_Decimal {
	public static int hex_to_deci(String num) {
		String num1=num.toUpperCase();
		int sum=0;
		int index=0;
		for(int i=num1.length()-1;i>=0;i--) {
			if(num1.charAt(i)>70) {
				return 0;
				
			}
			if(num1.charAt(i)>=65 && num1.charAt(i)<=70) {
				sum+=((num1.charAt(i)-65)+10)*Math.pow(16,index);
				index++;
			}
			else {
				if(num1.charAt(i)>=48 && num1.charAt(i)<=57)
				sum+=(num1.charAt(i)-48)*Math.pow(16,index);
				index++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter Number ---> ");
		String hex_num=input.nextLine();
		String num=hex_num.toUpperCase();
		System.out.println(hex_to_deci(num));

	}

}
