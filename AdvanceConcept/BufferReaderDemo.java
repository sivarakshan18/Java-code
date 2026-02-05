package AdvanceConcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.print("Enter any message");
		String str=br.readLine();
		System.out.println("Your message : "+str);
		
		System.out.print("Enter number:");
		int num=Integer.parseInt(br.readLine());
		System.out.println("number:"+num);

	}

}
