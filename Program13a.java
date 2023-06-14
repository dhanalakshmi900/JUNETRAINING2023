import java.util.Vector;
import java.util.Iterator;
class Main{
public static void main(String args[]){
Vector<String> animals=new Vector<>();
animals.add("DOG");
animals.add("CAT");
animals.add("HORSE");
String element=animals.get(2);
System.out.println("Element at index 2:"+element);
Iterator<String> iterate=animals.iterator();

System.out.print("Vector:");
while(iterate.hasNext())
{
System.out.print(iterate.next());
System.out.print(" ");




}
}
}