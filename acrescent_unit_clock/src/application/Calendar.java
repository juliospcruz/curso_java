package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Calendar {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	
	System.out.println(sdf.format(d));
	

	
	Calendar cal = Calendar.getInstance();

	private static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	cal.setTime(d);
	cal.add(Calendar.HOUR_OF_DAY, 4);
	d = cal.getTime();
	System.out.println(sdf.format(d));
	
}
