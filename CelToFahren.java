import java.util.Scanner;
class CelToFahren
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the Temperature  in degree celsius:");
		int celsius=sc.nextInt();
		float far=9/5;
		double fahrenheit=(far*celsius+32);
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}
