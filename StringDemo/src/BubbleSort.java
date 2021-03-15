
public class BubbleSort {
public static void main(String[] args) {
	int[] number= {7,9,3,6};
	int n =number.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
			
		if(number[j]>number[j+1])
		{
			int temp = number[j];
			number[j]=number[j+1];
			number[j+1]=temp;
		}
			
		
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(number[i]);
	}
}
}
