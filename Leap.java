import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
int year;
System.out.println("Enter the year");
Scanner num=new Scanner(System.in);
year=num.nextInt();
if(year%4==0)
System.out.println("Leap year");
else
System.out.println("Not leap year");
}
}
