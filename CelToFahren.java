import java.util.Scanner;
class CelToFahren
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a degree in celsius:");
		int celsius=sc.nextInt();
		float far=9/5;
		double Fahrenheit=(far*celsius+32);
		System.out.println(celsius + "Celcius is" + Fahrenheit + "Fahrenheit");
	}
}
