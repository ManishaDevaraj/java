import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
char c;
System.out.println("Enter a character ");
Scanner a=new Scanner(System.in);
c=a.next().charAt(0);
 if(c=='a' || c=='A' || c=='e' || c=='E' ||
        c=='i' || c=='I' || c=='o' || c=='O' ||
        c=='u' || c=='U')
System.out.println("Character is vowel");
else
System.out.println("Character is consonant");
}
}
