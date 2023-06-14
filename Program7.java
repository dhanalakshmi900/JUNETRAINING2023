import java.util.*;
class Simple{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("My,name,is,Dhana");
System.out.println("Next Token is"+st.nextToken(","));
System.out.println("Next Token is"+st.nextToken(","));
System.out.println("Next Token is"+st.nextToken(","));
System.out.println("Next Token is"+st.nextToken(","));
}
}