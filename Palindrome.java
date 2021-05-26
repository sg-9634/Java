import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int n,r,d,rev=0;
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(rev==t)//****here we hav to check intial no with reversd no but due to loop n becomes 0 thus we have to initially
			//store value of n into any variable******
			System.out.println("The no is Palindrome.");
		else
			System.out.println("The no is not Palindrome.");

	}

}
