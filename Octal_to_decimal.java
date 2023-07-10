package Number_System_Project;
import java.util.*;
public class Octal_to_decimal {
	public static int oct_count(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static int oct_to_dec(int num) {
		int oct_num=num;
		int sum=0;
		for(int i=0;i<oct_count(oct_num);i++) {
			sum+=(num%10)*Math.pow(8, i);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int oct_num=input.nextInt();
		System.out.println(oct_count(oct_num));
		System.out.println(oct_to_dec(oct_num));

	}

}
