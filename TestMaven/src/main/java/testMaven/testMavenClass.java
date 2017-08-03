package testMaven;

public class testMavenClass {

	public testMavenClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addition(45, 2));
		System.out.println(subtraction(100, 0));
		System.out.println(multiplication(48, 2));
		System.out.println(division(48, 2));
	}
	
	public static int addition(int x, int y) {
		return x + y;
	}
	
	public static int subtraction(int x, int y) {
		return x - y;
	}
	
	public static int multiplication(int x, int y) {
		return x * y;
	}
	
	public static int division(int x, int y) {
		return x / y;
	}


}
