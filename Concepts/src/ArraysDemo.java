
public class ArraysDemo {
	public static void main(String[] args) {
		int[] scores = new int[10];
		for(int i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}
		int[] numbers= {1,2,3,4};
		{
			for(int i=0;i<numbers.length;i++)
			{
				System.out.println(numbers[i]);
			}
		}
		
		boolean[] booleans= {true,false};
		for (boolean value : booleans) {
			System.out.println(value);
		}
		String[] names = new String[10];
		for (String name : names) {
			name = new String("Ram");
			name="Ram";
			System.out.println(name);
			
			Student[] students=new Student[10];
			for (int i = 0; i < students.length; i++) {
				Student student = new Student("Ram"+i);
				students[i]=student;
				if(i==5)
					break;
			}
			System.out.println("length=" + students.length);
			for (int j = 0; j < students.length; j++) {
				System.out.println(students[j].getName());
			}
		}
	}

}
 class Student
 {
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	 
	 
 }






