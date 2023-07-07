package day02.practice;

class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);  // this method over loading methods
	}
	
	public static void info (String msg) {
		System.out.println("INFO: " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {
		System.out.println("DEBUG: " + num);
	}
	
	public static void info (int num) {
		System.out.println("INFO: " + num);
	}
	
	public static void error (int num) {
		System.out.println("ERROR: " + num);
	}
	
}

public class DebugOverload {

	public static void main(String[] args) {
		
		
		
		Logger.debug("this is invalid");
		Logger.info("this is informatiom");
		Logger.error("this is 505 error");
		Logger.debug(10);
		Logger.info(505);
		Logger.error(7);
		
	}
}
