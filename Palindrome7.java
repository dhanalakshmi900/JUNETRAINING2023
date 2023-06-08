import java.util.Scanner;
class Palindrome7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();

//n=n.toLowerCase();
String temp="";
int ascii;
for(int i=n.length()-1;i>=0;i--){
if(n.charAt(i)>='a' && n.charAt(i)<='z'){
ascii=n.charAt(i);
ascii-=32;
temp=temp+(char)ascii;
}


else
{temp=temp+ n.charAt(i); }
}
System.out.println("temp:"+temp);
n=temp;
String rs="";

for(int i=n.length()-1;i>=0;i--){
rs=rs+n.charAt(i);
}
if(n.equals(rs))
System.out.println("YES");
else
System.out.println("NO");
}
}



