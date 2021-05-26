import java.util.Scanner;

public class Max3 {
	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter 1st no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter 2nd no");
		b=sc.nextInt();
		System.out.println("Enter 3rd no");
        c=sc.nextInt();
        if(a>=b)
        {
         if(a>=c) 
        	System.out.println("Max="+a);
        
        else 
        	System.out.println("Max="+c);
        }
        else 
        { 
        	if(b>=c)
        	System.out.println("Max="+b);
        	else System.out.println("Max="+c);
        
        }
        	
	}
}
