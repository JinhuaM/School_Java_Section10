import java.io.*;
class WriteFile{
 public static void main(String[] args) throws IOException{
	FileWriter fw=new FileWriter("test.txt");
	String str1="�Ͼ���ѧ����ѧԺ";
	String str2="��ӭʹ��Java";
	fw.write(str1);
	fw.write(str2);
	fw.close();
	System.out.println("������д�뵽�ļ�test.txt��");
}
}