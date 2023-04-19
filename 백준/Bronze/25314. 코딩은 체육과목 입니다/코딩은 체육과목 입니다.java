import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		String b = "long int";
		String c = "long ";

		if (a % 4 == 0) {
			if (a / 4 == 1) {
				System.out.println(b);
			} else {
				for (int i = 0; i < (a / 4) - 1; i++) {
					System.out.print(c);
				} System.out.println(b);
			}
		} else {
			System.out.println("4의 배수가 아닙니다.");
		}

		sc.close();
	}

}