package Demo;

abstract class Add
{
	abstract void add();
	void sub()
	{
		System.out.println("Substraction is");
		int a=50,b=20,c;
		c=a-b;
		System.out.println(c);
		
	}
}

class Sub extends Add
{
	void add()
	{
		
		System.out.println("Addition is");
		int x=50,y=40,z;
		z=x+y;
	System.out.println(z);
	}
	public static void main(String[] args)
	{
		Sub s=new Sub();	///object creation
		s.add();
		s.sub();

	}

}
