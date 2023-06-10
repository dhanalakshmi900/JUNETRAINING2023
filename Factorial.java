import java.util.Scanner;
class Factorial{
public static int CalculateFactorial(int n){
if(n==0)return 1;
else return n * CalculateFactorial(n-1);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
if(inputNum<0)System.out.println("INVALID");
else System.out.println(CalculateFactorial(inputNum));
}
}

