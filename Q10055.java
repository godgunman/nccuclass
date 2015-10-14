import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * http://luckycat.kshs.kh.edu.tw/homework/q10055.htm
 * 
 * @author ggm
 * 因為數字相差會 overflow 所以使用 BigDecimal，學習操作函式。
 *
 */
public class Q10055 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);

		while (in.hasNext()) {
			String s1 = in.next();
			String s2 = in.next();

			BigDecimal a = new BigDecimal(s1);
			BigDecimal b = new BigDecimal(s2);

			out.println(solve(a, b));
		}
	}

	private static String solve(BigDecimal a, BigDecimal b) {
		return String.valueOf((a.subtract(b)).abs());
	}
}
