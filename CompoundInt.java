import java.util.Scanner;

public class CompoundInt {

	public static void main(String[] args) {
	    double amount=0,intrest,principle,year,rate,s=0;
//		amount=20000*(1.06)*(1.06)*(1.06);
//		System.out.println("Total Amount After 3 Yr:"+amount);
//	    intrest=amount-20000;
//	    System.out.println("Intrest is:"+intrest);
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the prnciple:");
	    principle=sc.nextDouble();
	    System.out.println("Enter years:");
	    year=sc.nextDouble();
	    System.out.println("Enter the rate of intrest:");
	    rate=sc.nextDouble();
	    s=1+(rate/100);
	    amount=principle*(Math.pow(s, year));
	    System.out.println(+amount);

	}

}
