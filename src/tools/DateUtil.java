package tools;

import java.text.NumberFormat;

public class DateUtil {
	
	private static NumberFormat jourMoisFormatteurStatic = null;
	public static NumberFormat getJourMoisFormatteur() {
		if (jourMoisFormatteurStatic==null) {
			jourMoisFormatteurStatic = NumberFormat.getNumberInstance();
			jourMoisFormatteurStatic.setMinimumIntegerDigits(2);
			jourMoisFormatteurStatic.setMaximumFractionDigits(2);
		}
	    return jourMoisFormatteurStatic;
	}

}
