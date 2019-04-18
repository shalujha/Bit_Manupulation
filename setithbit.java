import java.util.Scanner;

// Q: set the ith bit from a given no.
public class setithbit {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();  // Input a no
		int i = sj.nextInt();  // Input the position of bit u want to set
		System.out.println(setIthBit(n, i));

	}

	// logic for doing this question is we will take a msk and shift left by i-1 times and the or it with ith bit of a given no , it will set its bit
	public static int setIthBit(int n, int i) {
		int mask = 1;   //  taken a mask
		int j = mask << (i - 1);  // shift it left by i-1 times
		n = n | j;   // orred it with ith bit of n
		return n;    // returned the no with set bit.
	}

}
