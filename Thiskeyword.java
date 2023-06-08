class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class Testthis1{
public static void main(String args[]){
Student s1=new Student(111,"Dhana",500f);
Student s2=new Student(222,"Lakshmi",1000f);
s1.display();
s2.display();
}
}

