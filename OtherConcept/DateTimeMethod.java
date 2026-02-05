package OtherConcept;

import java.time.LocalDate;

public class DateTimeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		System.out.println(ld.getYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.lengthOfMonth());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfYear());

	}

}
