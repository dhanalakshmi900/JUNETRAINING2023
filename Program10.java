import java.io.*;   
import java.util.*;   
class College {   
public String name;   
public String address;   
College(String name, String address)   
{   
this.name = name;   
this.address = address;   
}   
}   
class University {   
private final List<College> colleges;   
University(List<College> colleges)  
{  
this.colleges = colleges;  
}   
public List<College> getTotalCollegesInUniversity()   
{   
return colleges;   
}   
}   
class CompositionExample {   
public static void main(String[] args)   
{   
College c1= new College("MTIET","palamner");   
College c2= new College("Vemu Engineering College", "Kothakota");   
College c3= new College("Mits engineering college","madanpalli");   
List<College> college = new ArrayList<College>();   
college.add(c1);   
college.add(c2);   
college.add(c3);   
University university = new University(college);   
List<College> colleges = university.getTotalCollegesInUniversity();   
for (College cg : colleges) {   
System.out.println("Name : " + cg.name   + " and "  + " Address : " + cg.address);   
}   
}   
}