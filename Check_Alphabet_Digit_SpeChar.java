import java.util.Scanner;
class Check_Alphabet_Digit_SpeChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch=sc.next().charAt(0);

		String op=(ch>='A' && ch<='Z')?(ch +" is an Upper case character"):((ch>='a' && ch<='z')?(ch +" is a Lower case character"):((ch>='0' && ch<='9')?(ch + " is a digit"):(ch +" is a special character")));
		System.out.println(op);
	}
}