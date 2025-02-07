import java.util.Scanner;
class CheckCharUpOrLow
{
	public static void main(String[] args)
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter a Character:");
	
	char ch=ab.next().charAt(0);

	System.out.println((ch>='A' && ch<='Z')?("Character is in Upper case"):("Character is not in Upper case"));
	}
}