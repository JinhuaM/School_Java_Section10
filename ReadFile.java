import java.io.*;
class ReadFile{
 public static void main(String[] args) throws IOException{
	char c[]=new char[500];
	FileReader fr=new FileReader("myfile.txt");
	int num=fr.read(c);
	String str=new String(c,0,num);
	System.out.println("��ȡ���ַ�����Ϊ:"+num+",����������:");
	System.out.println(str);
}
}