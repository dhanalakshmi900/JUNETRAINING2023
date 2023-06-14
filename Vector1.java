import java.util.vector;
class Main{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("DOG");
mammals.add("HORSE");

mammals.add("CAT");
System.out.println("vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("Crocodile");
animals.addAll(mammals);
System.out.println("new vector:"+animals);
}
}

