import java.util.Scanner;

public class FunctionOvrAdd {
	    
              public static void add() {
            	  int a,b,c;
            	  System.out.println("Enter no to be added:");
            	  Scanner sc=new Scanner(System.in);
            	  a=sc.nextInt();
            	  b=sc.nextInt();
            	  c=a+b;
            	  System.out.println("Sum is"+c);
              }
              public static void add(int a,int b)
              {
            	  int c;
            	  c=a+b;
            	  System.out.println("Sum is"+c);
              }
              public static int add(int a,int b,int c)
              {
            	  int r=a+b+c;
            	  return r;
              }
	public static void main(String[] args) {
		
		add();
		//Scanner sc=new Scanner(System.in);
		int a=70;
		add(a,20);
		int p=add(10,20,30);
		System.out.println("Sum is"+p);
	}

}
