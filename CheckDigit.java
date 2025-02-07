import java.util.Scanner;
class CheckDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Input:");
		char input=sc.next().charAt(0);

		String ans=(input>='0' && input<='9')?(input +" is a digit"):(input + " is not a digit");
		System.out.println(ans);
	}
}