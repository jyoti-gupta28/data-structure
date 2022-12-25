
import java.util.Scanner;
public class power{
	
	public int pow(int n,int k)
	{
		if(k<0)
			return -1;
		if(k==0)
			return 1;
		return n*pow(n,k-1);
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			power ob=new power();
			int k1=ob.pow(n,k);
			System.out.println(k1);
		}
	}
}
