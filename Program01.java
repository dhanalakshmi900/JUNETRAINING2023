
import java.io.CharArrayReader;
class CharArrayExample{
public static void main(String args[])throws Exception{
char[] ary={'j','a','v','t','p','o','i','t'};
CharArrayReader reader=new CharArrayReader(ary);
int k=0;
while((k=reader.read())!=-1){
char ch=(char)k;
System.out.print(ch +":");
System.out.println(k);
}
}
}

