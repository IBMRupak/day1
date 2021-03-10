import java.util.logging.Logger;

public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.study();
		s1.study(1);
		s1.study(2,"Maths");
		
	}

}
class Student1
{
	//same method name but different number and types of arguements
	public void study(int duration,String subject)
	
	{
		System.out.println("study...for"+duration+ "hour"+subject);
	}
	public void study(int duration)
	{
		System.out.println("study...for"+duration+ "hour  .");
	}
	public void study()
	{
		System.out.println("study...");
	}
}
