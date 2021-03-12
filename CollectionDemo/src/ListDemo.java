import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class ListDemo {
public static void main(String[] args) {
	
	demo1();
	bookList();
}
  public static void bookList()
  {
	  List<Book> books= new ArrayList<Book>();
	  Book book1 = new Book("learn java");
//	 
	  book1.setPrice(100.0f);
	  books1.setPublishYear(2002);
	  books.add(book1);
	  //books.add(1);
	  Book book2= new Book("teach javascript");
	  book2.setPrice(20.0f);
	  book2.setPublishYear(2005);
	  books.add(book2);
	  
	//  books.remove(1);
	  System.out.println(books);
	  
	  books.sort(new Comparator<Book>() {
		  public int compare(Book book1, Book book2)
		  {
			  return (int)(book1.getPrice() - book2.getPrice());
		  }
	});
	  System.out.println("After sorting"+books);
	  
	  
	  books.sort(new Comparator<Book>() {
		  public int compare(Book book1, Book book2)
		  {
			  return (int)(book1.getPublishYear() - book2.getPublishYear());
		  }
	});
	  System.out.println("After sorting"+books);
	  
	 
  }

public static void demo1()
{
List<Integer> list = new ArrayList<Integer>();//generics
list.add(1);
list.add(3);
System.out.println("before"+list);
//list.remove(1);
System.out.println(list.contains(2));
System.out.println("after"+list);
for (Iterator iterator = list.iterator(); iterator.hasNext();) {
	Integer integer = (Integer) iterator.next();
	System.out.println(integer);
	
}
}
}
