package demo2;

public class Demo01 {

	public static void main(String[] args) {
		F f = new Z();
		System.out.println(f.a);
		f.b();
		Z z = (Z) f;
		z.b();
		// ZZ zz = (ZZ) f;
		// zz.b(); // java.lang.ClassCastException: demo2.Z cannot be cast to demo2.ZZ

		f.c();
		f.d();
		z.e();
	}
}

class F {
	int a = 1;

	static void b() {
		System.out.println("F");
	}

	void c() {
		System.out.println("F c");
	}

	void d() {
		this.c();
	}
}

class Z extends F {
	int a = 2;

	static void b() {
		System.out.println("Z");
	}

	void c() {
		System.out.println("Z c");
	}

	void d() {
		c();
	}

	void e() {
		super.c();
	}
}

class ZZ extends F {
	int a = 3;

	static void b() {
		System.out.println("ZZ");
	}
}
