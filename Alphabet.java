import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{
char c;
System.out.println("Enter the character");
Scanner num=new Scanner(System.in);
c=num.next().charAt(0);
if((c>= 'a' && c<= 'z') || (c>= 'A' && c<='Z'))
System.out.println("Alphabet");
else
System.out.println("Not Alphabet");
}
}
