package OtherConcept;
import java.io.*;
public class FileInJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("demo.txt");
		if(f.createNewFile())
			System.out.println("File Created");
		else
			System.out.println("Already Exist");
		
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		
		String str[]=
			{
					"Hii",
					"hello",
					"Everyone"
			};
		for(String s:str)
		   dos.writeUTF(s);
		
		dos.writeUTF("siva");
		
		
		FileInputStream fis=new  FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		while(dis.available()>0) {
			String line=dis.readUTF();
			System.out.println("File content "+line);
		}
		
		if(f.exists()) {
			System.out.println(f.getName()); 
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
		}
		else
			System.out.println("File doesn't exist");
		
		fos.close();
		dos.close();
		fis.close();
		dis.close();
		
		f.delete();

	}

}
