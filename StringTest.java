package reference;

public class StringTest {

	public static void main(String[] args) {
	
		String str1 = "jang";
		String str2 = new String("jang"); //new 를 통해 주소값 생성
		String str3 = "jang";
		String str4 = new String("jang");
		
		if(str1 == str3)/*주소값 다르다는 것을 비교 */{
			System.out.println("str1, str3의 stack 주소가 같다");			
		}
		else {
			System.out.println("str1, str3의 stack 주소가 다르다");	
		}
		
		 if(str1 == str2) {
			System.out.println("str1, str2의 stack 주소가 같다");
		}
		else {
				System.out.println("str1, str1의 stack 주소가 다르다");	
			}
		 if(str2 == str4) {
				System.out.println("str2, str4의 stack 주소가 같다");
		}
		else {
					System.out.println("str2, str4의 stack 주소가 다르다");	
			}
		
		 if(str2.equals(str4))/*주소가 아닌 값 비교*/ {
				System.out.println("str2, str4의 stack 값이 같다");
		}
		else {
					System.out.println("str2, str4의 stack 값이 다르다");	
			}
	}

}
