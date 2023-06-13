
class Pattern{
public static void main(String args[]){
int n=20;
for(int i=1,p=0;i<=n;i++,p++)
{
for(int j=1;j<=i;j+=3)
{
System.out.print(p+" ");
}
System.out.println();
}
}
}