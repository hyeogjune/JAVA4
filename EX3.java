package operator;

public class EX3 {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오. 
		
		int a = 0;
		
		for(int i=1; i<=10; i++) {
			if(i<=10) {
			a = a+i;
			System.out.println(a);
			}			
		}
		System.out.println(a);
		
		
	}
	
}
