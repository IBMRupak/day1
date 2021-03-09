
public class Student extends Human {
private String name;
private byte age;

  void study()
  {
	  System.out.println(this.name+" is studying");
  }

Student ()
{

}
Student (String name)
{
	this.name=name;
}


}
