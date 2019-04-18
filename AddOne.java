import java.util.Scanner;

public class AddOne {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		// int n=sj.nextInt();
		// System.out.println(addOne(n));
		// System.out.println(magicNo(3));
		// System.out.println(pasculsum(6));
		System.out.println(powerOftwo(0));

	}

	public static int addOne(int n) {
		int mask = 1;
		while ((n & mask) != 0) {
			n = n ^ mask;
			mask = mask << 1;
		}
		n = n ^ mask;
		return n;
	}

	public static int magicNo(int i) {

		int pow = 1;
		int ans = 0;
		while (i != 0) {
			pow *= 5;
			if ((i & 1) != 0) {
				ans += pow;
			}
			i = i >> 1;
		}
		return ans;
	}

	public static int pasculsum(int n) {
		int res = 1 << n;
		return res - 1;
	}

	public static boolean powerOftwo(int n) {
		if (n != 0) {
			if ((n & (n - 1)) == 0) {
				return true;
			}
		}
		return false;
	}
}
