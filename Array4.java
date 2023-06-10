import java.util.Scanner;
class Sortelement
{
public static void main(String args[]){
int n,i=0,temp=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter no.of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
System.out.print(a[i]+" ");
}
for(int k=0;k<=a.length;k++){
for(int j=k+1;j<a.length;j++){
if(a[k]>a[j]){
temp=a[k];
a[k]=a[j];
a[j]=temp;}
}
}System.out.println();
System.out.println("Elements of array sorted in ascending order:");
for(int k=0;k<a.length;k++){
System.out.print(a[k]+" ");
}
}
}

