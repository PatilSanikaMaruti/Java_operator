import java.util.Scanner;
class SmallestNoAmongThree
{
	public static void main(String[] args)
	{
		Scanner ab= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=ab.nextInt();

		System.out.println("Enter Second Number:");
		int num2=ab.nextInt();

		System.out.println("Enter Third Number:");
		int num3=ab.nextInt();

		int temp=num1<num2?num1:num2;
		int smallest=num3<temp?num3:temp;

		System.out.println("Smallest Number Among Entered Three Number:"+smallest);

	}
}

