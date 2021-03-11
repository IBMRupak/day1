
public class Institute {
public static void main(String[] args) {
	StudentAbstract Student1 = new CollegeStudent();
	Student1.study();
	Student1.admit();
	StudentAbstract Student2 = new HighSchoolStudent();
	Student2.study();
	Student2.admit();
	
}
}
