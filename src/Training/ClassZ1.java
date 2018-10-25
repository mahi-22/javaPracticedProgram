package Training;

class Z3 
{
	static int i;	
	static
		{
			System.out.println("Z3.SIB");
		}
}
class Z2
{
	static
	{
		System.out.println("Z2.SIB");
	}	
public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(Z3.i);
		System.out.println("main end");

	}
}