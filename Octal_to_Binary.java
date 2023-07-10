package Number_System_Project;
import java.util.*;
public class Octal_to_Binary {
	public static String oct_to_bin(int a) {
		int oct_to_deci=Octal_to_decimal.oct_to_dec(a);
		String deci_to_binary=Decimal_to_Binary.deci_to_bin(oct_to_deci);
		return deci_to_binary;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();
		System.out.println(oct_to_bin(num));
		

	}

}
