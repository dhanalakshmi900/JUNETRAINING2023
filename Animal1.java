class Animal1{
void eat(){System.out.println("Eating..");}
}
class Dog extends Animal{
void bark(){System.out.println("barking..");}
}
class Cat extends Dog{
void meow(){System.out.println("meowing");}
}
class Testinheritance3{
public static void main(String args[]){
Cat c=new Cat();
c.meow();
c.bark();
c.eat();
}
}
