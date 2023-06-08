class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name, String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name, String course,float fee){
this(rollno,name,course);
this.fee=fee;

}
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}

class Testthis7{
public static void main(String args[]){
Student s1=new Student(111,"Dhana","java");
Student s2=new Student(222,"Lakshmi","java",1000f);
s1.display();
s2.display();
}
}

