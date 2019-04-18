import java.util.Scanner;

// Q: Extract the ith bit from a given no
public class Extractithbit {

	
	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();   // we input the no
		int i=sj.nextInt();   // we have given which bit the user has to extract from a no
		System.out.println(Extract(n,i));
	}
	// Now , we have used a logic that we will do an and  operation between ith bit and make a mask which will perform this operation with ith bit.
	public static int Extract(int n,int i)
	{
		int j=1<<(i-1);  // making mask
		n=n & j;         // and operation with bitwise and operator
		return (n==0?0:1);        // returning the ith bit.
		
		
	}

}
