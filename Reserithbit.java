import java.util.Scanner;

// Q: Reset the ith bit from a given number.
public class Reserithbit {

	
	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();  // input a number
		int i=sj.nextInt();  // input the position of a number u want to reset
		System.out.println(Reset(n,i));
		
	}
	// Now the logic behind this solution is we will form a mask having one at this given bit and remaining position will have 0 and then complement it and then do and operation of number(Given) and mask.
	public static int Reset(int n,int i)
	{
		int mask=1;
		int j=~(mask<<(i-1));
		n=n&j;
		return n;
	}

}
