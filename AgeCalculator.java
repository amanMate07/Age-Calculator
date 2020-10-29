

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class AgeCalculator {
	public static void main(String args[])
	{
		System.out.println(ageCalculator("2020-09-29"));
	}
	public static String ageCalculator(String registrationDate) {
		String result = null;
		try {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate today = LocalDate.now(); // Today's date
			LocalDate birthday = LocalDate.parse(registrationDate, dateTimeFormatter);
			Period p = Period.between(birthday, today);

			String yearSuffix = "Years";
			String monthSuffix = "Months";
			String daySuffix = "Days";


			if (p.getYears() == 0 && p.getMonths() != 0) {
				if (p.getMonths() == 1) {
					result = p.getMonths() + " " + "Month";
				} else {
					result = p.getMonths() + " " + monthSuffix;
				}
			} else if (p.getMonths() == 0 && p.getYears() != 0) {
				if (p.getYears() == 1) {
					result = p.getYears() + " " + "Year";
				} else {
					result = p.getYears() + " " + yearSuffix;
				}
			} else if (p.getYears() == 0 && p.getMonths() == 0) {
				if (p.getDays() == 1) {
					result = p.getDays() + " " + "Day";
				} else {
					result = p.getDays() + " " + daySuffix;
				}
			} else {
				if (p.getYears() == 1) {
					result = p.getYears() + " " + "Year";
				} else {
					result = p.getYears() + " " + yearSuffix;
				}
			}
			return result;
		} catch (Exception e) {

		}
		return result;
	}


}
