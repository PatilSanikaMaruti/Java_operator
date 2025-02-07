import java.util.Scanner;
class Grade
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks upto 600:");
		int marks=sc.nextInt();
		float per=(marks*100)/600;
		String ans=(per>=75 )?("Grade A with " +per+"%"):((per>=60 )?("B"):((per>=35)?("C"):("Fail")));
		System.out.println(ans);
		

	}
}