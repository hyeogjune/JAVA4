package operator;

public class EX8 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
		System.out.println(fibo(i));
		}
		
		
	}
	
	
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		} 
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}
	
}
