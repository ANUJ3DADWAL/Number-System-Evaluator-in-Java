package Number_System_Project;
import java.util.*;
public class Binary_to_Octal {
	public static String bin_to_oct(int a) {
		int bin_to_deci=Binary_to_Decimal.bin_to_dec(a);
		String deci_to_oct=Decimal_to_Octal.deci_to_oct(bin_to_deci);
		return deci_to_oct;
		
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();
		System.out.println(bin_to_oct(num));
		

	}

}
