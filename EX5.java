package operator;

public class EX5 {

	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		
		System.out.println(a);
		System.out.println(b);
		
		if(a+b == 6) {
			System.out.println("a+b´Â " + (a+b));
		}
		
	}
	
}
