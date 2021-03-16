
public class ExceptionPropogation {
public static void main(String[] args) {
	new A().m1();
}
}
class A {
	void m1() {
		try {
		m2();
		
		} catch(RuntimeException runtimeException )
		{
			runtimeException.printStackTrace();
			
		}catch (Exception exception)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("Always executed");
		}
		
		
		
		System.out.println("A1");
	}
	void m2() throws Exception{
		System.out.println("A2");
		//throw new RuntimeException();
	}
}
