import java.util.Scanner;
class Power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int result=1;
System.out.println("Enter the base no");
int base=sc.nextInt();

System.out.println("Enter the power");
int power=sc.nextInt();


for(int i=1;i<=power;i++){
result*=base;}
System.out.println("Result: "+result);
}
}

