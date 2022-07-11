package project03;

import java.util.Scanner;
public class SmartPhoneMain {
	
	public static int nu;
	public static void main(String[] args) {
		
		SmartPhone smartphone = new SmartPhone();
		Scanner in = new Scanner(System.in);
		
		System.out.println("연락처 2개를 입력합니다.");
		smartphone.addContact(smartphone.inputContactData(1));
		smartphone.addContact(smartphone.inputContactData(2));

		do {
			printMenu();
			nu = in.nextInt();
			if (nu>=1 && nu<=7) {
				switch(nu) {
				case 1:
					System.out.println("회사 연락처를 등록하시오.");
					smartphone.addContact(smartphone.inputContactData(1));
					continue;
				case 2:
					System.out.println("거래처 연락처를 등록하시오.");
					smartphone.addContact(smartphone.inputContactData(2));
					continue;
				case 3:
					System.out.println("모든 연락처를 출력하시오.");
					smartphone.printAllContact();
					continue;
				case 4:
					System.out.println("검색할 연락처의 이름을 입력하시오.");
					String name = in.next();
					smartphone.searchContact(name);
					continue;
				case 5:
					System.out.println("삭제할 연락처의 이름을 입력하시오.");
					name = in.next();
					smartphone.deleteContact(name);
					continue;
				case 6:
					System.out.println("수정할 연락처의 이름을 입력하시오.");
					name = in.next();
					Contact newContact = new Contact();
					smartphone.editContact(name, newContact);
					continue;	
				case 7:
					System.out.println("프로그램을 종료합니다.");
					break;	
				}
			} else {
				System.out.println("메뉴 내의 숫자를 입력하시오.");
				continue;
			}
		} while (nu != 7);
	}

	public static void printMenu() {	
		System.out.println("Contact-----------------------");
		System.out.println(">> 1. 연락처 등록(회사)");
		System.out.println(">> 2. 연락처 등록(거래처)");
		System.out.println(">> 3. 모든 연락처 출력");
		System.out.println(">> 4. 연락처 검색");
		System.out.println(">> 5. 연락처 삭제");
		System.out.println(">> 6. 연락처 수정");
		System.out.println(">> 7. 프로그램 종료");
		System.out.println("------------------------------");
	}
}