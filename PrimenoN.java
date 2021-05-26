import java.util.Scanner;
public class PrimenoN
{  
public static void main(String[] args)   
{  
int ct=0,n=0,i=1,j=1,l;
System.out.println("Enter a limit:");
Scanner sc= new Scanner(System.in);
l=sc.nextInt();
while(n<l)  
{  
j=1;  
ct=0;  
while(j<=i)  
{  
if(i%j==0)  
ct++;  
j++;   
}  
if(ct==2)  
{  
System.out.printf("%d ",i);  
n++;  
}  
i++;  
}  
}  
}  