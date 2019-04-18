import java.util.Scanner;

public class RightmostPositionsetbit {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		System.out.println(find(n));

	}

	public static int find(int n) {
		int pos = 1;
		int mask = 1;
		while ((n & mask) == 0) {
			pos++;
			mask = mask << 1;
		}
		return pos;

	}

}
