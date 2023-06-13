import java.util.Scanner;
class Series{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int dec=sc.nextInt();
for(int i=num;i>=0;i-=dec)
{
System.out.print(i);
if(i>=dec)
System.out.print(",");}
}
}