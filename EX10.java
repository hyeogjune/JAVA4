package operator;

public class EX10 {
	public static void main(String[] args) {
		// N 이 주어질 때, 길이가 N 인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.) 
		
		int N = 0;
		for(int i = 1; i<=100; i++) {
			N = N+i;
			
		}
		System.out.println(N);
	}
}
