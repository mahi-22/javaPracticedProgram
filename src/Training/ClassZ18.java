package Training;

class Z19
{
static int i = 10;
static{
	System.out.println("Z18.SIB:"+i);
	i=20;
}
}
class ClassZ18{
	static{
		System.out.println("Z19.SIB");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		System.out.println(Z19.i);
		System.out.println("----------");
		System.out.println(Z19.i);
		System.out.println("----------");
		System.out.println("main end ");
	}
}