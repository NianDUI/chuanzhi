import java.util.Arrays;

/*
 * 
 */
public class Demo02PrintArray {
	int[] arr = new int[5];
	boolean bl;

	public boolean isBl() {
		return bl;
	}

	public Demo02PrintArray(int[] arr, boolean bl) {
		super();
		this.arr = arr;
		this.bl = bl;
	}

	public void setBl(boolean bl) {
		this.bl = bl;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 54, 65, 45 };
		System.out.println(Arrays.toString(arr));
		System.out.println("==============");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
			System.out.println("ÄãºÃ");
		}
	}

	public Demo02PrintArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo02PrintArray(int[] arr) {
		super();
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
}
