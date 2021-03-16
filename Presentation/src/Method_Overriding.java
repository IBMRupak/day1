class Phone
{
	public void name()
	{
		System.out.println("Its an Android Phone");
	}
	public void device()
	{
		System.out.println("Phone is A device");
	}
}
class SmartPhone extends Phone
{
	public  void name1()
	{
		System.out.println("Its a Samsung Phone");
	}
	@Override
	public void device()
	{
		System.out.println("SmartPhone is a device");
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		
		Phone ph = new Phone();
		SmartPhone sp = new SmartPhone();
		Phone ph1 = new SmartPhone();//Dynamic Method Dispatch
		Smartphone sp1 = new Phone();
		ph1.device();
		
    sp.device();		
		
	}
	


}
