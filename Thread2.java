class Cal extends Thread{
public static void main(String args[]){
Cal ob=new Cal();
Thread threadobj=new Thread(ob);
threadobj.start();
System.out.println("Threads  inside main are very much useful in java");
}
public void run(){
System.out.println("Threads from overridden run method are helpful");
}
}