import java.io.PrintWriter;
import java.util.Scanner;

/**
 * http://luckycat.kshs.kh.edu.tw/homework/q10035.htm
 * @author ggm
 * 算出進位的個數。主要可以帶出之後要講的迴圈。重點在使用取餘數的操作。
 *
 */

public class Q10035 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);

		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == 0 && b == 0)
				return;
			out.println(solve(a, b));
		}
	}

	private static String solve(int a, int b) {
		int ans = 0;
		int carry = 0;

		while (a != 0 || b != 0) {

			carry = ((a % 10) + (b % 10) + carry) / 10;
			a /= 10;
			b /= 10;
			ans += carry;

		}

		if (ans == 0)
			return "No carry operation.";
		else if (ans == 1)
			return ans + " carry operation.";
		else
			return ans + " carry operations.";
	}
}
