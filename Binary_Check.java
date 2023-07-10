package Number_System_Project;
import java.util.*;
public class Binary_Check {
	public static int binary_check(int num) {
		int count=0;
		while(num!=0) {
			if(num%10==1 || num%10==0) {
				count++;
			}
			else {
				count=0;
				break;
			}
			num=num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number ---> ");
		int num=input.nextInt();
		System.out.println(binary_check(num));

	}

}
