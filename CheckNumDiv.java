import java.util.Scanner;
class CheckNumDiv
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();

		
	    String ans=(num%2==0 && num%5==0)?("HiTwoHiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):("_")));
		System.out.println(ans);
	}
}