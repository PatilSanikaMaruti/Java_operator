import java.util.*;
class PrimeNoWithoutLoop
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=ab.nextInt();

		System.out.println((num==2||num==3)?(num +" is prime"):((num%2==0||num%3==0)?(num +"is not prime"):(num + "is prime")));

	}
}