import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		int i,n,sum=0;
		System.out.println("Enter a limit :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
        	sum=sum+i;
        }
        System.out.println("Sum of series is:"+sum);
	}

}
