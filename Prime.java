import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter a no:");
		Scanner p=new Scanner(System.in);
		n=p.nextInt();
		
		for(i=2;i<n;i++) {
		if(n%i==0)
		{
			System.out.println("The No Is NOT PRIME.");
			break;
		
		}
		else {
			System.out.println("The no is  prime.");
			break;
	}
	
	
	}
}
}
