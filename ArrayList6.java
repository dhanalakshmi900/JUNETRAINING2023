import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
List<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed element:"+number);
int Removednumber=numbers.remove(1);
System.out.println("Removed element:"+Removednumber);

}
}