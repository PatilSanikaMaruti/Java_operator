import java.util.Scanner;
class LargestNoAmongThree
{
	public static void main(String[] args)
	{
		Scanner ab= new Scanner(System.in);
		System.out.print("Enter First Number:");
		int num1=ab.nextInt();

		System.out.print("Enter Second Number:");
		int num2=ab.nextInt();

		System.out.print("Enter Third Number:");
		int num3=ab.nextInt();

		int temp=num1>num2?num1:num2;
		int largest=num3>temp?num3:temp;

		System.out.println("Largest Number Among Entered Three Number:"+largest);

	}
}