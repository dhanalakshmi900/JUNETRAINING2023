import java.util.Scanner;
class Test3b{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
char sp=" ";
for(int i=0;i<=10;i++)
{
System.out.print(num);
System.out.println(sp+"*"+sp+i+ "="+(num*i));
}
}
}



