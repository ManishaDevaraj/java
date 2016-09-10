import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int num;
System.out.println("Enter a number ");
Scanner a=new Scanner(System.in);
num=a.nextInt();
if (num%2==0)
System.out.println("Even Number");
else
System.out.println("Odd Number");
}
}
