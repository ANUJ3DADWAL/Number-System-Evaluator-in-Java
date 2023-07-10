package Number_System_Project;
import java.util.*;
public class Binary_to_Decimal {
//	Binary to Decimal Conversion.

	public static int bin_count(int binary_num) {
		int count=0;
		while(binary_num!=0) {
			count++;
			binary_num/=10;
		}
		return count;
	}
	public static int bin_to_dec(int bin) {
		int sum=0;
		int binary_num=bin;
		for(int i=0;i<bin_count(binary_num);i++) {
			sum+=(bin%10)*(int)Math.pow(2,i);
			bin=bin/10;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int binary_num=input.nextInt();
		System.out.println(bin_count(binary_num));
		System.out.println(bin_to_dec(binary_num));

	}

}
