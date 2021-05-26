import java.util.Scanner;

public class ReverseNo {

	
		public static void main(String[] args) {
			int n,r,d,rev=0;
			System.out.println("Enter a no:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			
			while(n>0)
			{
				r=n%10;
				n=n/10;
				rev=rev*10+r;
			}
			System.out.println("Reverse no is:"+rev);

	}

}
