package reference;

public class StringTest {

	public static void main(String[] args) {
	
		String str1 = "jang";
		String str2 = new String("jang"); //new �� ���� �ּҰ� ����
		String str3 = "jang";
		String str4 = new String("jang");
		
		if(str1 == str3)/*�ּҰ� �ٸ��ٴ� ���� �� */{
			System.out.println("str1, str3�� stack �ּҰ� ����");			
		}
		else {
			System.out.println("str1, str3�� stack �ּҰ� �ٸ���");	
		}
		
		 if(str1 == str2) {
			System.out.println("str1, str2�� stack �ּҰ� ����");
		}
		else {
				System.out.println("str1, str1�� stack �ּҰ� �ٸ���");	
			}
		 if(str2 == str4) {
				System.out.println("str2, str4�� stack �ּҰ� ����");
		}
		else {
					System.out.println("str2, str4�� stack �ּҰ� �ٸ���");	
			}
		
		 if(str2.equals(str4))/*�ּҰ� �ƴ� �� ��*/ {
				System.out.println("str2, str4�� stack ���� ����");
		}
		else {
					System.out.println("str2, str4�� stack ���� �ٸ���");	
			}
	}

}