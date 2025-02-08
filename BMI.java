import java.util.Scanner;
class BMI
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the weigth in pounds:");
	    double weight=sc.nextDouble();

		System.out.print("Enter the height in inches:");
	    double height=sc.nextDouble();
		
		double kg=(weight*0.45359237);
	
		double meter=(height*0.0254);
		
		double BMI=(kg/(meter*meter));
		System.out.println(BMI);

	}
}




