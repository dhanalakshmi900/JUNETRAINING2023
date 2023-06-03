import java.util.*;
public class Program208
{
public static void main(String[] args)
{
char ch;
System.out.print("Enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int X=(int)ch;
System.out.println("the ascii value of"+ch+"is"+X);
}
}
