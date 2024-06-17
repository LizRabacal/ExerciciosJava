package br.com.sinerji.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	public static void info(String msg) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("[INFO] " + msg + " - " + sdf.format(new Date()));
	}
	
	public Class<Logger> getLoggerClass(){
		return Logger.class;
	}

}
