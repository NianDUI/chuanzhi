package sday08;

class X {
	X() {
		System.out.print("X");
	}
}

class Y {
	X x = new X();

	Y() {
		System.out.print("Y");
	}
}

public class Z extends Y {
	Y y = new Y();
	X x = new X();

	Z() {
		System.out.print("Z");
	}

	public static void main(String[] args) {
		new Z();
	}
}
