class SwapNoWithThirdVar
{
	public static void main(String[] args)
	{
		int a=9;
		int b=5;
		System.out.println("Before swapping two numbers:");
		System.out.println("a:" +a);
		System.out.println("b:" +b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swapping two numbers:");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	}
}


