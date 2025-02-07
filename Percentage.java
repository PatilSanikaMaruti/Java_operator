import java.util.Scanner;
class Percentage
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks Upto 600:");
		int marks=sc.nextInt();
		
		String ans=(marks>=35)?("pass"):("fail");
		System.out.println(ans);
		float percentage=(marks/6);
		System.out.println(percentage);

	}
}