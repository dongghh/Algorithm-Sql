import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] array = new int[a];

		int max = -1000000;
		int min = 1000000;

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();

			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}