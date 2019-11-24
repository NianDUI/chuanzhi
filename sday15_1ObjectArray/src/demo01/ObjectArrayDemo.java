package demo01;

/*
 * 	我有五个学生，请把这五个学生的信息存储到数组中，并遍历数组获得每一个学生信息.
 * 		学生：Student
 * 		成员变量：name,age
 * 		构造方法：无参，有参
 * 		成员方法：getXxx()/setXxx()
 * 		存储学生的数组? 自己想一想应该是怎么样的?
 * 
 * 
 * 
 */
public class ObjectArrayDemo {
	
	public static void main(String[] args) {
		Student[] students = new Student[5];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("20" + i, 20 + i);
		}

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
	}

}
