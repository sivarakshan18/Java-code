package OtherConcept;
import java.time.*;
public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalDate d1=LocalDate.of(2025,Month.JUNE,30);
		System.out.println(d1);
		
		Instant i=Instant.now();
		System.out.println(i);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		LocalTime t1=LocalTime.of(21,45,20);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.now(ZoneId.of("Asia/Qatar"));
		
		
		/*
		for(String val:ZoneId.getAvailableZoneIds()) {
			System.out.println(val);
		}
		*/

	}

}
