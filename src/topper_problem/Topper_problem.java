package topper_problem;

import java.util.Scanner;

public class Topper_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int odd_sum=0;
		int even_sum=0;
		while(number>0)
		{
			int remainder=number%10;
			if(remainder%2==0)
			{
				even_sum+=remainder;
			}
			else
			{
				odd_sum+=remainder;
			}
			number/=10;
		}
		if(odd_sum==even_sum)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
