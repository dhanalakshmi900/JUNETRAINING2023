import java.util.ArrayList;
class Main{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("cat");
animals.add("dog");
animals.add("cow");
System.out.println("ArrayList:"+animals);
String str=animals.get(1);
System.out.print("Element at index 1 is:"+str);
str=animals.get(2);
System.out.println("Element at index 2 is:"+str);

}
}