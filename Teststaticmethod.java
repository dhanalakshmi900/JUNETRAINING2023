class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="ITS";}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
 public class Teststaticmethod{
public static void main(String args[]){
Student.change();
Student s1=new Student(81,"Dhana");
Student s2=new Student(82,"Ammu");
Student s3=new Student(83,"Revathi");

s1.display();
s2.display();
s3.display();

}
}

