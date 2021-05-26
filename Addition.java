import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		 int a,b,c;
		char p,q;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Values:");
		a= sc.nextInt();		
        b=sc.nextInt();
        c=a+b;
        System.out.println("Addition is:"+c);
        
        System.out.println("Enter Characters:");
		p= sc.next().charAt(0);		
        q=sc.next().charAt(0);
        System.out.println("Addition is:"+p+q);
        
        
}

}
