import java.io.*;
class WriteFile{
 public static void main(String[] args) throws IOException{
	FileWriter fw=new FileWriter("test.txt");
	String str1="南京大学金陵学院";
	String str2="欢迎使用Java";
	fw.write(str1);
	fw.write(str2);
	fw.close();
	System.out.println("内容已写入到文件test.txt中");
}
}