import java.util.ArrayList;
class Main{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
languages.add("java");
languages.add("python");
languages.add("swift");
System.out.println("ArrayList:"+languages);
languages.set(2,"Javascript");
System.out.println("Modified list:"+languages);

}
}