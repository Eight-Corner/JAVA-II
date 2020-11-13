import java.util.Scanner;

class Phone {
	String name; // 필드 변수 인스턴스변수 멤버변수 
	private int pw;
	int num;
	Phone(){
	}
	void setPw(int pw) { // setter 패스워드
		this.pw = pw;
	}

	int getPw() {
		return this.pw;
	}
	
	Phone(String name, int pw, int num) {
		this.name = name;
		this.pw = pw;
		this.num = num;
	}
	

	boolean checkPw(int pw) {
		if (this.pw == pw) {
			System.out.println("[잠금해제]");
			return true;
		} else {
			System.out.println("비밀번호 오류");
			return false;
		}
	}

	void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력 >");
		int pw = sc.nextInt();
		if (checkPw(pw)) {
			System.out.println((this.name + "님의 번호는 [" + this.num + "] 입니다."));
		}
	}

}
class SmartPhone extends Phone{ //스마트폰은 폰이라는 클래스를 상속받는다
	public SmartPhone(String name,int pw, int num) {
		super(name, pw, num);
	}
	public SmartPhone() {
	}
	void changePw(int newpw) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 비밀번호 입력 >");
		int pw = sc.nextInt();
		if(checkPw(pw)) {
			setPw(newpw); // 보안 되어있는 pw를 새로운 입력값으로 세팅하기 위해 불러오기
			System.out.print("변경할 비밀번호 입력 >");
			newpw = sc.nextInt();
			this.getPw(); //

			System.out.println("비밀번호 변경 완료");
		}else {
			System.out.println("현재 비밀번호가 다릅니다. 변경 실패");
		}
	}
}

public class MainAct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Phone p1 = new Phone("홍길동", 1234, 1073500816);
		// 인스턴스화 == 객체화 == 
		p1.show();
		
		
		SmartPhone sp1 = new SmartPhone();
							new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		
		
		System.out.print("\n회원 가입-\n이름을 입력하세요 : ");
		sp1.name = sc.next();
		sc.nextLine(); //버퍼
		System.err.print("전화번호 입력 :");
		sp1.num = sc.nextInt(); 
		System.out.println("비밀번호 설정");
		int pw = sc.nextInt();
		sp1.setPw(pw);
		sp1.show();
		
	}

}
