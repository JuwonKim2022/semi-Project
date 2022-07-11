package project02;

import java.util.*;
public class SmartPhone {

	Contact[] member = new Contact[10];

	int[] newMember = null;
	int n = 0;

	Scanner in = new Scanner(System.in);

	public Contact inputContactData() {//키보드로 입력받아 객체 생성

		System.out.print("이름 : ");
		String sNa = in.nextLine();
		System.out.print("전화번호 : ");
		String sNo = in.nextLine();
		System.out.print("이메일 : ");
		String sEm = in.nextLine();
		System.out.print("주소 : ");	
		String sAd = in.nextLine();
		System.out.print("생일 : ");
		String sBi = in.nextLine();
		System.out.print("그룹 : ");
		String sGr = in.nextLine();	

		Contact contact = new Contact(sNa,sNo,sEm,sAd,sBi,sGr);
		return contact;
	}	

	public void addContact(Contact contact) {
		member[n] = inputContactData();
		System.out.println(">>>데이터가 저장되었습니다. ("+(n+1)+")");
		n += 1;
		return;
	}

	public void printContact(Contact contact) { 
		contact.printInfo();
	}

	public void printAllContact(){ 
		for(int i=0; i<n; i++) {
			member[i].printInfo();
			System.out.println("--------------------");
		}
		return;
	}

	public void searchContact(String name) { //연락처 검색.
		String input = in.nextLine();
		if (input.contentEquals(name)) {
			System.out.println("일치하는 정보가 존재합니다.");
			return;
		} else {
			System.out.println("일치하는 이름이 존재하지 않습니다.");	
			return;
		}
	}

	public void deleteContact(String name) { //연락처 삭제.
		System.out.println("삭제하고자 하는 연락처의 이름을 입력하세요.");
		String del = in.nextLine();
		int count = member.length;
		boolean flag1 = false;

		for (int i=0; i<count; i++) {
			if(del.equals(member[i])) {
				for(int j=i; j<count-1; j++) {
					member[j]=member[j+1];
				}
				count--;
				flag1=true;
				break;
			}
		}

		if(flag1) {
			System.out.println("====삭제 후 정보====");

		for(int i=0; i<count; i++) {
			System.out.println(member[i]+" ");
		}
		System.out.println("\n============");
		} else {
			System.out.println("삭제할 정보가 없습니다.");
		}
	}	

	public void editContact(String name, Contact newContact) { //연락처 수정.
	
		System.out.println("수정하고자 하는 이름을 입력하세요.");
		String corr = in.nextLine();

		boolean flag2 = false;
		
		for(int i=0; i<member.length; i++) {
			if(corr.equals(member[i])) {
				System.out.println("새로운 이름을 입력하세요.");
				String ren = in.nextLine();
				name=ren;
				flag2 = true;
			}
		}
		if(flag2) {
			System.out.println("이름이 정상적으로 수정되었습니다.");
			System.out.println(Arrays.toString(member));
			return;
		} else {
			System.out.println("찾는 이름은 없습니다.");
		}
		return;

	}
}