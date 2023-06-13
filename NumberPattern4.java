import java.util.Scanner;
class NumberPattern4{
public static void printLine(int start,int stop){
for(int i=start;i<=stop;i++)
{
System.out.print(i);
if(i<stop)System.out.print(",");
}
}
public static void printPattern(int n){
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printLine(0,0);System.out.println();
printLine(1,2);System.out.println();
printLine(3,5);System.out.println();
printLine(6,9);System.out.println();

}

}
 		