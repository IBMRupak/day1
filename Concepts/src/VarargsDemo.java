
public class VarargsDemo {
	public static void main(String[] args) {
		int result= add("Ram",2,3,4,5,6,7);
		System.out.println(result);
	}
	static int add(String name,int... numbers)//varargs
	{    int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		System.out.println(name);
		return sum;
	}

}
