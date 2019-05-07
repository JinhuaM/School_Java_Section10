import java.io.*;

class CopyFile{
 public static void main(String[] args) throws IOException{
	int i;
	FileInputStream fin=new FileInputStream("myfile.txt");
	FileOutputStream fout=new FileOutputStream("yourfile.txt");
	do{
		i=fin.read();
		if(i!=-1)
		fout.write(i);
	}while(i!=-1);
	fin.close();
	fout.close();
	System.out.println("myfile.txt内容已经被复制到yourfile.txt文件中");
}
}