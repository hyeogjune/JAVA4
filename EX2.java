package operator;

public class EX2 {
	
	public static void main(String[] args) {
		//1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
		int sum = 0;
		
		for(int i=1; i<=20; i++) {
			
			if(i%2 != 0 && i%3 !=0) {
				sum = sum+i; // sum = 1, 5, 7, 11, 13, 17, 19
			}
			System.out.println(sum);
			
		}
		System.out.println(sum);
		
	}
}