package OtherConcept;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello";
		
		System.out.println(s.length());
		System.out.println(s.indexOf('e'));
		System.out.println(s.charAt(0));
		//System.out.println(s.toUpperCase());
		String s33="123";
		int n=Integer.parseInt(s33);
		System.out.println(n);
		
		s=s.concat(" World");
		System.out.println(s);
		
		String s1="the WORld";
		String s2="zhe world";
		System.out.println(s1.compareTo(s2));
	    System.out.println("Lowercase:"+s1.toLowerCase());
		
		String s3="  Hello    ";
		s3=s3.trim();
		System.out.println(s3.length());
		
		String s4="hello world";
		s4=s4.replaceAll("he", "she");
		System.out.println(s4);
		
		
		String s5="TheLion";
		System.out.println(s5.substring(0,4));
		
		System.out.println(s5.contains("Li"));
		
		String s6="abc";
		String s7="ABC";
		System.out.println(s6.equals(s7));
		
		System.out.println(s1.lastIndexOf('l'));
		
		String strs="The-Adventure-Program";
		String ss[]=strs.split("-");
		
		for(String temp:ss) {
			System.out.println(temp);
		}
		
		String vowels="aeiou";
		char ch[]=vowels.toCharArray();
		for(char val:ch) {
			System.out.println(val);
		}
		String aa=String.valueOf(ch);
		System.out.println(aa);
		
		String str="hello";
		String str1= new String("hello");
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		
		
		

	}

}
