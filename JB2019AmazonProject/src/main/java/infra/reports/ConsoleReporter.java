package infra.reports;

import java.text.SimpleDateFormat;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

public class ConsoleReporter {
	
	public static ReportDispatcher report = ReportManager.getInstance();

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss: ");
	
	public static void report(String message) {
		
		message = dateFormat.format(System.currentTimeMillis()) + message;
		System.out.println(message);
	}
}
