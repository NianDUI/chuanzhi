package demo04;

import book.Book;

//这个包并没有没导出，就算依赖了book模块也不能使用
//import book.secret.*;

public class DemoModule {
	
	public static void main(String[] args) {
		Book.readBook();
	}

}
