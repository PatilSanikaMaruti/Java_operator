import java.util.Scanner;
class VolAreOfCylinder
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the Radius of a Cylinder:");
		float rad=sc.nextFloat();
		
		System.out.println("Enter the height of a Cylinder:");
		float height=sc.nextFloat();

		double area=3.14*rad*rad;
		double volume=area*height;

	    System.out.println("Area  of a Cylinder:" +area);
		System.out.println("Volume of a Cylinder:" +volume);
	}
}


