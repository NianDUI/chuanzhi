package demo02_HashSet;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + age;
////		result = prime * result + ((name == null) ? 0 : name.hashCode());
////		return result;
//
////		return 0;
//		// 因为成员变量值影响了哈希值，所以我们把成员变量值相加即可
////		return this.age + this.name.hashCode();
//		// 看下面：
//		// s1:name.hashCode() 40, age=30
//		// s2:name.hashCode()我们可以把他们乘以一些整数。
//		return this.name.hashCode() + this.age * 15;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("比较了：" + this + "------" + obj);
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
