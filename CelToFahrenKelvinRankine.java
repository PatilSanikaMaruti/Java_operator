import java.util.Scanner;
class CelToFahrenKelvinRankine
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Temperature in  degree celsius:");
		int celsius=sc.nextInt();
		System.out.println();
		float far=9/5;

		double fahrenheit=(far*celsius+32);
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

		double kelvin=celsius+273.15;
		System.out.println(celsius + " Celsius is " + kelvin + " Kelvin");

		double rankine=(celsius*far+491.67);
		System.out.println(celsius + " Celsius is " +rankine + " Rankine");



	}
}
