package InterFaceConcept;
import java.io.*;
class Save implements Serializable{
	int i;
}
public class MarkerInterface {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Save obj1=new Save();
		obj1.i=98;
		//System.out.println(obj1.i);
		
		File f=new File("myfile.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		FileInputStream fis=new  FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj2=(Save) ois.readObject();
		
		System.out.println(obj2.i);
		

	}

}
