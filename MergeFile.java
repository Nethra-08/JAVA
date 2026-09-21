import java. util.*;
import java.io.*;
class FileMerge
{
public static void main(String[] args)throws Exception
{
FileInputStream in = new FileInputStream("input.txt");
FileOutputStream out = new FileOutputStream("output.txt");
int ch;
while((ch=in.read())!=-1)
out.write(ch);
FileInputStream in2 = new FileInputStream("input2.txt");
while((ch=in2.read())!=-1)
out.write(ch);
System.out.println("Content of two input files merged into the output file");
}
}
i
