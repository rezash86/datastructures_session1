package service;

public class Main {
	
	public static void main(String ... args) {
		
		CalcService service = new CalcService();
		
		System.out.println(service.addNumbers(12, -1));
		
	}
}
