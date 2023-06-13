import java.util.Scanner;
class Extract{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int res;
int c=0;
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)>='0' && str.charAt(i)<='9' )
{
res=res+str.charAt(i);
}
}
System.out.println(res);

for(int i=1;i<=res;i++)
{
	if(res%i==0)
{
c+=1;

}
}
if(c==2)
{
System.out.println("PRIME");
}
else
System.out.println("NO");
}
}