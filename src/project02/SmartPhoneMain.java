package project02;

import java.util.*;

public class SmartPhoneMain {
	public static void main(String[] args) {

		Contact contact = new Contact();
		SmartPhone smartphone = new SmartPhone();
		Scanner in = new Scanner(System.in);

		int nu;

		System.out.println("연락처 2개를 입력합니다.");
		smartphone.addContact(contact);
		smartphone.addContact(contact);

		do {
			printMenu();
			nu = in.nextInt();

			if (nu>=1 && nu<=6) {
				switch(nu) {
				case 1:
					System.out.println("연락처를 등록하시오.");
					smartphone.addContact(contact);
					continue;
				case 2:
					System.out.println("모든 연락처를 출력합니다.");
					smartphone.printAllContact();
					continue;
				case 3:
					System.out.println("검색하실 연락처의 이름을 입력하시오.");
					smartphone.searchContact(null);
					continue;
				case 4:
					System.out.println("연락처를 삭제합니다.");
					smartphone.deleteContact(null);
					continue;
				case 5:
					System.out.println("연락처를 수정합니다.");
					smartphone.editContact(null, contact);
					continue;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					break;	
				}
			} else {
				System.out.println("메뉴 내의 숫자를 입력하시오.");
				continue;
			}
		} while (nu != 6);
	}

	public static void printMenu() {	

		System.out.println("Contact-----------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("------------------------------");

	}
}