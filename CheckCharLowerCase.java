import java.util.Scanner;
class CheckCharLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char ch=sc.next().charAt(0);

		String ans=(ch>='a' && ch<='z')?(ch +" is a Lower case character"):(ch + " is not a Lower case character");
		System.out.println(ans);
	}
}