import java.util.Scanner;
class ReverseNum
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the Number upto 3 digit:");
		int num=ab.nextInt();
		int dup=num;
		int rev=0;

		int rem=num%10;
		rev=rev*10+rem;

		num=num/10;
		rem=num%10;
		rev=rev*10+rem;

		num=num/10;
		rem=num%10;
		rev=rev*10+rem;

		System.out.println(dup + ":"+rev);
	}
}