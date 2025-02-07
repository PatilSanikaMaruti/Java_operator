import java.util.Scanner;
class SumOfDigitOFInteger
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter an Integer between 1 to 1000:");
		int num=ab.nextInt();

		int firstDigit=num%10;
		int rem=num/10;
		int secondDigit=rem%10;
	    rem=rem/10;
		int thirdDigit=rem%10;
	    rem=rem/10;
		int fourthDigit=rem%10;
	    int sum=firstDigit+secondDigit+thirdDigit+fourthDigit;
		System.out.println("The sum of all digits in " +num+" is: " +sum);
	}
}
