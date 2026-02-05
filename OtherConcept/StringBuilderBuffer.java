package OtherConcept;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("hello");
		
		//sb=sb.append(" world");
		//System.out.println(sb);
		
		//System.out.println(sb.capacity());
		
		//System.out.println(sb.length());
		//System.out.println(sb.reverse());
		
		//System.out.println(sb.charAt(0));
		
		//System.out.println(sb.substring(0,3));
		//System.out.println(sb.subSequence(0,3));
		
		//sb.insert(5, "user");
		
		//sb.delete(2, 4);
		sb.replace(0, 1, "j");
		System.out.println(sb);
		

	}

}
