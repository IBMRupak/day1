
public class StackOverflowDemo {
	public static void main(String[] args) {
		callMe();
	}

	public static void callMe()
	{
		callMe();
		System.out.println("called");
	}
}
