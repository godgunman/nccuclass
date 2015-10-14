import java.io.PrintWriter;
import java.util.Scanner;

/**
 * http://luckycat.kshs.kh.edu.tw/homework/q12468.htm
 * @author ggm
 * 簡單的思考題，使用 if 判斷式。
 *
 */

public class Q12468 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);

		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == -1 && b == -1)
				return;
			out.println(solve(a, b));
		}
	}

	private static String solve(int a, int b) {
		int c = 0;
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
			
		return String.valueOf(Math.min(b-a, a + 99-b + 1));
	}
}
