import java.util.*;
public class sum {
	
	public int sumdig(int n)
	{
		if(n<=0)
			return 0;
		return n%10+sumdig(n/10);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sum ob=new sum();
		int k=ob.sumdig(n);
		System.out.println(k);
	}
}
