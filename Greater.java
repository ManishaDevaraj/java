import java.util.Scanner;
class Greater
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter Three numbers ");
Scanner num=new Scanner(System.in);
a=num.nextInt();
b=num.nextInt();
c=num.nextInt();
if(a>b && a>c)
System.out.println("The greater number is "+a);
else if(b>c)
System.out.println("The greater number is "+b);
else
System.out.println("The greater number is "+c);
}
}
