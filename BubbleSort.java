package practise.com;

public class BubbleSort {
	public static void main(String[] args) {

		int[] a = { 9, 8, 7, 5, 6 };
		int length = a.length;
		System.out.println("Before Swapping");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int temp = 0;

		for (int i = 0; i < length; i++) {

			for (int j = 1; j < (length - i); j++) {

				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("After swapping");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}

}
