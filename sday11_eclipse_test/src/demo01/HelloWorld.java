package demo01;

import book.Book;
import demo02.Student;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		Book b = new Book();
		Book.readBook();
		System.out.println(b);
		
		Student s = new Student();
		s.setName("asd");
		s.setAge(24);
	}

}
