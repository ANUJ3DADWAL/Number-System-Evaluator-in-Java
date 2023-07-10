package Number_System_Project;
import java.util.*;
public class Number_System {
	public static void switch_for_bin() {
		Scanner input=new Scanner(System.in);
		boolean b=true;
		while(b) {
			System.out.println("Press 1. Convert Binary To Decimal");
			System.out.println("Press 2. Convert Binary To Octal");
			System.out.println("Press 3. Convert Binary To Hexadecimal");
			System.out.println("Press 4. Exit From Binary");
			System.out.print("Enter Convert Choice ---> ");
			int bin_num=0;
			int bin_choice=input.nextInt();
			if(bin_choice<4) {
				System.out.print("Enter Binary Number ---> ");
				bin_num=input.nextInt();
			}
			if(Binary_Check.binary_check(bin_num)==0 && bin_choice<4) {
				System.out.println("*** Invalid Input ***");
			}
			else {

			switch(bin_choice) {
			case 1:
				System.out.println("Answer ---> "+Binary_to_Decimal.bin_to_dec(bin_num));
				break;
			case 2:
				System.out.println("Answer ---> "+Binary_to_Octal.bin_to_oct(bin_num));
				break;
			case 3:
				System.out.println("Answer ---> "+Binary_to_Hexadecimal.bin_to_hex(bin_num));
				break;
			case 4:
				System.out.println("*** Exiting From Binary Converter ***");
				b=false;
				break;
			default:
				System.out.println("*** Please enter valid choice ***");
			}
			
		}
		}
	}
	
	public static void switch_for_octal() {
		Scanner input=new Scanner(System.in);
		boolean b=true;
		while(b) {
			int oct_num=0;
			System.out.println("Press 1. Convert Octal To Binary");
			System.out.println("Press 2. Convert Octal To Decimal");
			System.out.println("Press 3. Convert Octal To Hexadecimal");
			System.out.println("Press 4. Exit From Octal Converter");
			System.out.print("Enter Convert Choice ---> ");
			int oct_choice=input.nextInt();
			if(oct_choice<4) {
				System.out.print("Enter Octal Number ---> ");
				oct_num=input.nextInt();
			}

			switch(oct_choice) {
			case 1:
				System.out.println("Answer ---> "+Octal_to_Binary.oct_to_bin(oct_num));
				break;
			case 2:
				System.out.println("Answer ---> "+Octal_to_decimal.oct_to_dec(oct_num));
				break;
			case 3:
				System.out.println("Answer ---> "+Octal_to_Hexadecimal.oct_to_hex(oct_num));
				break;
			case 4:
				System.out.println("*** Exiting From Binary Converter ***");
				b=false;
				break;
			default:
				System.out.println("*** Please, Enter valid choice ***");
			}
			
		}
	}
	public static void switch_for_Decimal() {
		Scanner input=new Scanner(System.in);
		boolean b=true;
		while(b) {
			int deci_num=0;
			System.out.println("Press 1. Convert Decimal To Binary");
			System.out.println("Press 2. Convert Decimal To Octal");
			System.out.println("Press 3. Convert Decimal To Hexadecimal");
			System.out.println("Press 4. Exit From Decimal Converter");
			System.out.print("Enter Convert Choice ---> ");
			int deci_choice=input.nextInt();
			if(deci_choice<4) {
				System.out.print("Enter Decimal Number ---> ");
				deci_num=input.nextInt();
			}

			switch(deci_choice) {
			case 1:
				System.out.println("Answer ---> "+Decimal_to_Binary.deci_to_bin(deci_num));
				break;
			case 2:
				System.out.println("Answer ---> "+Decimal_to_Octal.deci_to_oct(deci_num));
				break;
			case 3:
				System.out.println("Answer ---> "+Decimal_to_Hexadecimal.deci_to_hex(deci_num));
				break;
			case 4:
				System.out.println("*** Exiting From Decimal Converter ***");
				b=false;
				break;
			default:
				System.out.println("*** Please, Enter valid choice ***");
			}
			
		}
	}
	public static void switch_for_hexa() {
		Scanner input=new Scanner(System.in);
		boolean b=true;
		while(b) {
			String hexa_num="";
			System.out.println("Press 1. Convert Hexadecimal To Binary");
			System.out.println("Press 2. Convert Hexadecimal To Octal");
			System.out.println("Press 3. Convert Hexadecimal To Decimal");
			System.out.println("Press 4. Exit From Hexadecimal Converter");
			System.out.print("Enter Convert Choice ---> ");
			int hexa_choice=input.nextInt();
			input.nextLine();
			if(hexa_choice<4) {
				System.out.print("Enter Hexadecimal Number ---> ");
				hexa_num=input.nextLine();
			}

			switch(hexa_choice) {
			case 1:
				System.out.println("Answer ---> "+Hexadecimal_to_Binary.hex_to_bin(hexa_num));
				break;
			case 2:
				System.out.println("Answer ---> "+Hexadecimal_to_Octal.hex_to_oct(hexa_num));
				break;
			case 3:
				System.out.println("Answer ---> "+Hexadecimal_to_Decimal.hex_to_deci(hexa_num));
				break;
			case 4:
				System.out.println("*** Exiting From Hexadecimal Converter ***");
				b=false;
				break;
			default:
				System.out.println("*** Please, Enter valid choice ***");
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		 boolean a=true;
		 System.out.println();
		 System.out.println("*** WELCOME TO NUMBER SYSTEM EVALUATOR ***");
		 System.out.println();
		while(a) {
			System.out.println("Press 1. Convert Binary To Other Bases");
			System.out.println("Press 2. Convert Decimal To Other Bases");
			System.out.println("Press 3. Convert Octal To Other Bases");
			System.out.println("Press 4. Convert Hexadecimal To Other Bases");
			System.out.println("Press 5. For Exit");
			System.out.print("Enter Choice ---> ");
			int num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("*** WELCOME TO BINARY CONVERTER ***");
				switch_for_bin();
				break;
			case 2:
				System.out.println("*** WELCOME TO DECIMAL CONVERTER");
				switch_for_Decimal();
				break;
			case 3:
				System.out.println("*** WELCOME TO OCTAL CONVERTER");
				switch_for_octal();
				break;
			case 4:
				System.out.println("*** WELCOME TO HEXADECIMAL CONVERTER");
				switch_for_hexa();
				break;
			case 5:
				System.out.println("Exiting From Number System Converter");
				a=false;
				break;
			default:
					System.out.println("Please Enter Valid Choice");
			}
		}

	}

}
