package junit;

public class Math {
	public int add(int... numbers) {
		int result=0,c=0;
		while(c<numbers.length)
		{
			result+=numbers[c++];
		}
		return result;
	}
/**
 * Multiplication of two positive numbers only
 */
	int multiply(int... number) {
		
		
		int result =1,c=0;
		while(c<number.length)
		{
			int currentnumber = number[c++];
			if (currentnumber < 0)
			{
				throw new IllegalArguementException();
			}
			result*=currentnumber;
		}
		return result;
	}
}
