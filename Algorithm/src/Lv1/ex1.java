package Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
	static int cnt = 0;
	static String[] name;
	static String[] addPerson() {
		Scanner sc = new Scanner (System.in);
		System.out.print("몇명의 인원을 설정 하시겠습니까? :");
		cnt = sc.nextInt();
		String[] name = new String[cnt];
		return name;
	}
	
	static String[] addName() {
		Scanner sc =new Scanner (System.in);
		String name[] = new String[cnt];
		for(int i = 0; i < name.length; i++) {
			name[i] = null;
		}
		System.out.println("이름을 넣으세요. 중간에 끝내려면 0");
		for(int i = 0; i < name.length; i++) {
			System.out.print(" >");
			name[i] = sc.next();
		}
		return name;
	}
	
	static String[] sameName() {
		int overlap = 0;
		for (int i = 0; i < name.length; i++ ) {
			for(int j = 1; j < name[i].length(); j++) {
				if(name[i].equals(name[j])) {
					overlap++;
					System.out.println(name[i]+"중복 이름입니다.");
				}
			}
		} System.out.println("중복이 총 "+overlap+"개 있습니다.");
		return name;
	}
	static String[] overlapDelete() {
		System.out.println("정렬을 시작합니다.");
		Arrays.sort(name);
		for(String sortName : name) {
			System.out.print(sortName+", ");
		}
		System.out.print("정렬을 완료 했습니다.");
		System.out.println("스캔을 시작합니다.");
		for(int i = 0; i < name.length; i++) {
			for(int j = 1; j < name[i].length(); j++) {
				if(name[i].equals(name[j])) {
					System.out.print("중복을 발견하여 제거합니다. 중복 :"+name[j]);
					name[j] = null; // 현재 J의 값을 제거한다.
				} else {
					System.out.print("\t. . .\t");
				}System.out.println();
			}
		}
		System.out.println("중복 제거를 마칩니다.");
		return name;
	}
	
	  static String[] nameList() {
		  System.out.println("[명단]");
			int cnt=0;
			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i]+", ");
				cnt++;
				if( cnt%5 == 0 ) {
					System.out.println();
				} 
			}
			return name;
	  
	  }
	 
	static void show() {
		System.out.println("\t----MENU----\t");
		System.out.println("1. 이름 설정");
		System.out.println("2.김씨와 이씨는 각각 몇명인지 확인");
		System.out.println("3.이재영 이라는 이름이 몇 번 반복 되는가");
		System.out.println("4.중복을 정렬하고 이름을 제거합니다.");
		System.out.println("6. 명단 출력");
	}
	public static void main(String[] args) {
		/* 사이냅소프트 면접 문제 
		 * 
		 * 주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성
		 * 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,
		 * 김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,
		 * 김재성,이유덕,전경헌
		 *
		 * 1. 김씨와 이씨는 각각 몇 명인가. 
		 * 2. 이재영 이라는 이름이 몇 번 반복 되는가. 
		 * 3. 중복을 제거한 이름을 출력 
		 * 4. 중복을 제거한 이름을 오름차순으로 정렬 출력
		 */
		Scanner sc = new Scanner (System.in);
		int sel = 0;
		while(true) {
			ex1.show();
			System.out.println("Select Menu >");
			sel = sc.nextInt();
			switch(sel) {
			case 1:
				name = addPerson();
				name = addName();
				System.out.println("저장 완료");
			break;
			case 2:
				name = sameName();
				break;
			case 3:
				name = overlapDelete(); 
				break;
			case 4: 
				break;
			case 5:
				
				break;
			case 6:
				name = nameList();
				System.out.println("\n n을 누르면 MENU화면으로 ");
				String n = sc.next();
				if (n.equals("n")) {
					break;
				}
				default : break;
			}


		}

	}
	
	

}
