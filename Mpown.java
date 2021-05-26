import java.util.Scanner;

public class Mpown {

	public static void main(String[] args) {
		double n,r=1,p;
		System.out.println("Enter the no:");
		Scanner sc= new Scanner(System.in);
		p=sc.nextDouble();
	    System.out.println("Enter the power:");
	    n=sc.nextDouble();
	    r= Math.pow(p, n);
	    System.out.println("The result is:"+r);
	}

}
