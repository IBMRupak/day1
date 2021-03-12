
public class Book {

	int a=0;
	void m()
	{
		int b=20;
		int a=10;
		System.out.println(this.a);
		if(a==2)
		{
			b=10;
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		Book book = new Book();
	}
}
