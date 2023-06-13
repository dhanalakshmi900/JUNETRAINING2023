import java.io.*;
public class A{
public static void main(String args[]){
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter ur name");
String name=br.readLine();
System.out.println("Welcome"+name);
}
}