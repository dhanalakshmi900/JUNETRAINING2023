import java.io.*;
class FileRead1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countConsonents=0;
while((i=br.read())!=-1){
if(((char)i>='a') && ((char)i<='z'))
countConsonents++;}
System.out.print(countConsonents);

br.close();
fr.close();
}
}