import java.util.Scanner;
class Season
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month:");
		String month=sc.next();
		String ans=(month.equals("February"))||(month.equals("March"))|| (month.equals("April"))||(month.equals("May"))?( month +"  is Summer"):
					(month.equals("June"))|| (month.equals("July")) || (month.equals("August"))|| (month.equals("Sepetember"))?( month + " is Mansoon"):
					(month.equals("October"))|| (month.equals("November")) || (month.equals("December"))|| (month.equals("Janevary"))?( month + " is Winter"):
			        "Invalid Month";
		System.out.println(ans);
	}
}
