package Training;

class Z21 
{
	static int i;
	static
	{
		i=20;
		System.out.println("Z21.SIB:"+i);
		System.out.println("Z21.SIB:"+Z21.i);
	}
	}
 class Z20
	{
		static
		{
			System.out.println("Z21.SIB");
		}
		public static void main(String[] args){
			System.out.println("main begin");
			System.out.println(Z21.i);
			Z21.i=300;
			System.out.println("----------");
			System.out.println(Z21.i);
			Z21.i +=300;
			System.out.println("----------");
			System.out.println(Z21.i);
			System.out.println("main end ");
		}
	}
