import java.util.*;
public class fibonacci {
		public int fib(int n)
		{
			if(n<0)
				return -1;
			if(n==0||n==1)
				return n;
			return fib(n-1)+fib(n-2);
		}
		public static void main(String args[])
		{
			try (Scanner sc = new Scanner(System.in)) {
				int n=sc.nextInt();
				fibonacci ob=new fibonacci();
				int k=ob.fib(n);
				System.out.println(k);
			}
		}
}
