package popUp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GenerateDate {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate plusDate = date.plusDays(120);
		System.out.println(plusDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("_--------------------_");
		System.out.println(formatter.format(date));
		System.out.println(formatter.format(plusDate));
	}
}
