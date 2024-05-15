package java_8_features.time.local_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDate_LocalTime_Test {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println("YYYY-MM-DD : "+d); //2024-05-15
		LocalTime t = LocalTime.now(); 
		System.out.println("HH:mm:ss:milisecnd(9-digit) : "+t); //23:08:56.717986300
		
		//add and subtract 57 days from 2024-05-15
		LocalDate plusDays = d.plusDays(57);
		System.out.println(plusDays);
		LocalDate minusDays = d.minusDays(57);
		System.out.println(minusDays);
		
		//create obj of this date 10-05-2024
		LocalDate date = LocalDate.of(2023, 5, 10);//(YYYY,MM,DD)
		LocalDate date1 = LocalDate.of(2023, Month.MAY, 10);//(YYYY,MMM,DD)
		System.out.println(date+" : "+date1); //2023-05-10 : 2023-05-10
		

		LocalDateTime d1 = LocalDateTime.of(2024, Month.MAY, 10,01,01);
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println(d1+" : "+d2);  //2024-05-10T01:01 : 2024-05-15T23:37:37.875211100
		Duration duration = Duration.between(d1, d2);
		System.out.println(duration.toDays()); //5
		System.out.println(duration.toHours()); //142
		System.out.println(duration.toMinutes()); //8561
		System.out.println(duration.toMillis()); //513719573
		
		//String => Date 
		//Date =>String
		
		
	}
}
