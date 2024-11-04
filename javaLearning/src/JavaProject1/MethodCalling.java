package JavaProject1;

public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is print statement from main method");
		methodA();
		
		methodB(10);
	}

	public static void methodA() {
		System.out.println("This statement is from method A");
	}
	
	
	public static void methodB(int a) {
		System.out.println("This statement is from method B"+ a);
	}
	
}
