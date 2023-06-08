class Student{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+""+name+""+college);}
}
 public class Teststaticvariable1{
public static void main(String args[]){
Student s1=new Student(81,"Dhana");
Student s2=new Student(82,"Ammu");
Student.college="MTIET";

s1.display();
s2.display();
}
}

