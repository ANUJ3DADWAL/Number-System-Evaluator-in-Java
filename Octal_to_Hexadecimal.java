package Number_System_Project;
import java.util.*;
public class Octal_to_Hexadecimal {
	public static String oct_to_hex(int a) {
		int oct_to_deci=Octal_to_decimal.oct_to_dec(a);
		String deci_to_hex=Decimal_to_Hexadecimal.deci_to_hex(oct_to_deci);
		return deci_to_hex;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();
		System.out.println(oct_to_hex(num));

	}

}
