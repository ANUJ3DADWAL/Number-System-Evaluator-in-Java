package Number_System_Project;
import java.util.*;
public class Hexadecimal_to_Binary {
	public static String hex_to_bin(String a) {
		int hex_to_deci=Hexadecimal_to_Decimal.hex_to_deci(a);
		String deci_to_bin=Decimal_to_Binary.deci_to_bin(hex_to_deci);
		return deci_to_bin;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		String num=input.nextLine();
		System.out.println(hex_to_bin(num));

	}

}
