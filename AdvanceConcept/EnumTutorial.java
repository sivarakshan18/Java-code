package AdvanceConcept;
enum Shape{
	CIRCLE(0),TRIANGLE(3),SQUARE(4);
	
	private int side;
	private Shape(){
		System.out.println("Constructor called....");
	}
	private Shape(int side) {
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	
}
public class EnumTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj=Shape.SQUARE ;
		System.out.println(obj.ordinal());
		Shape  []obj1=Shape.values();
		for(Shape val:obj1) {
			System.out.println(val);
		}
		
		
		System.out.println("Sides="+obj.getSide());

	}

}
