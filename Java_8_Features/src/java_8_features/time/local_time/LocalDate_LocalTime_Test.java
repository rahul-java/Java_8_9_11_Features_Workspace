package java_8_features.time.local_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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
		System.out.println("=======Date =>String==============Convert Date to String================");
		LocalDateTime d3 = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String dateTimeString = d3.format(formatter);
		String dateString = d3.format(formatter1);
		System.out.println("Date Time in String Format : "+dateTimeString); //2024-05-16 20:17:01
		System.out.println("Date in String Format : "+dateString); //2024-05-16
		
		System.out.println("=======String => Date==============Convert String to Date================");
		String dateTime="2023-12-11 17:30:25";
		String dateString1="2023-12-11";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime, formatter);
		LocalDate localDate = LocalDate.parse(dateString1, formatter1);
		System.out.println("Formatted Date Time :"+ localDateTime); //2023-12-11T17:30:25
		System.out.println("Formatted Date :"+ localDate); //2023-12-11
		
		System.out.println("=======================ZonedDateTime=======================");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		//ZonedDateTime withZoneSameInstant = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		ZonedDateTime withZoneSameInstant = zonedDateTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(withZoneSameInstant);
		
		
	}
}
