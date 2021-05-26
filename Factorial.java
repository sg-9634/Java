import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
     int i,no,fact=1;
     System.out.println("Enter the no");
     Scanner sc=  new Scanner(System.in);
     no=sc.nextInt();
     for(i=no-1;i>0;i--)
     {
      fact=fact*i;
	}
System.out.println("Factorial of no is:"+fact);
}
}
