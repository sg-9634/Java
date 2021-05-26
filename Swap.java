import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter 1st no:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Eter 2nd no");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
