import java.util.Scanner;
class NoOfYears
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		double minutesInYear=60*24*365;
		System.out.println(" Ente the number of minutes:");
		double min=ab.nextDouble();

		long years=(long)(min/minutesInYear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+" minutes is approximately " +years+" years and " +days+" days");
	}
}