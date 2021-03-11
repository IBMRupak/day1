
public class FinalKeyword {
public static void main(String[] args) {
 Parent child = new Child();
 child.m1();
}
}
class Parent{
	final String name= "Rupak";
	final void m1()
	{
		System.out.println("Parent");
	}
	void m2
	{
		
	}
}
class Child extends Parent
{
	void m1()//override
	{
		System.out.println("child");
	}
	@Override
	void m2
	{
		
	}
	
	
	
	
}