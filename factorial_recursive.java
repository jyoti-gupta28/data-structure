import java.util.*;
public class factorial_recursive {
		public int factorial(int n)
		{
			if(n<0)
				return 1;
			if(n==0||n==1)
				return 1;
			return n*factorial(n-1);
			
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			factorial_recursive ob=new factorial_recursive();
			int f=ob.factorial(n);
			System.out.println(f);
		}
}
