package dataConversion;

public class Student {
public Student(String Name)
{
	this.name=name;
	//name=this.name;
	
}
private String name;
private int age;
private GENDER gender;
public String getName() {
	return name;
}
void eat()
{
	System.out.println("H");
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public GENDER getGender() {
	return gender;
}
public void setGender(GENDER gender) {
	this.gender = gender;
}
}
