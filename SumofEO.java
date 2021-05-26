import java.util.Scanner;
public class SumofEO {

	public static void main(String[] args) {
		int i,n,sumEvn=0,sumOdd=0;
		System.out.println("Enter size of series:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++) 
		{
			if(i%2==0)
			
				sumEvn=sumEvn+i;
		
		else 
			sumOdd=sumOdd+i;
		}
		
		System.out.println("Sum of Even="+sumEvn);
		System.out.println("Sum of Odd="+sumOdd);
	

}
}
