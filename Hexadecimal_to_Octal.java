package Number_System_Project;
import java.util.*;
public class Hexadecimal_to_Octal {
	public static String hex_to_oct(String a) {
		int hex_to_deci=Hexadecimal_to_Decimal.hex_to_deci(a);
		String deci_to_oct=Decimal_to_Octal.deci_to_oct(hex_to_deci);
		return deci_to_oct;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		String num=input.nextLine();
		System.out.println(hex_to_oct(num));
		

	}

}
