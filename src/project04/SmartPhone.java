package project04;
import java.util.Scanner;
public class SmartPhone {

	Contact[] member = new Contact[10];
	
	int n = 0;
	int i; 
	
	Scanner in = new Scanner(System.in);

	public Contact inputContactData(int choice) {
		
		System.out.print("이름 : ");
		String name = in.next();
		System.out.print("전화번호 : ");
		String mobile = in.next();
		System.out.print("이메일 : ");
		String eMail = in.next();
		System.out.print("주소 : ");	
		String address = in.next();
		System.out.print("생일 : ");
		String birth = in.next();
		System.out.print("그룹 : ");
		String group = in.next();	
		
		Contact contact =null;
		
		if (choice==1) {
			System.out.print("회사이름 : ");
			String companyName = in.next();
			System.out.print("부서이름 : ");
			String companyDivision = in.next();
			System.out.print("직급 : ");
			String companyPosition = in.next();
			
			contact = new CompanyContact(name,mobile,eMail,address,birth,group,companyName,companyDivision,companyPosition);
			
		} else if (choice==2) {
			System.out.print("거래처이름 : ");	
			String accountName = in.next();
			System.out.print("거래품목 : ");
			String product = in.next();
			System.out.print("직급 : ");
			String accountPosition = in.next();
			
			contact = new CustomerContact(name,mobile,eMail,address,birth,group,accountName,product,accountPosition);
		}		
		return contact;
	}

	public void addContact(Contact contact) {
		member[n] = contact;
		n++;
		System.out.println(">>>데이터가 저장되었습니다. ("+n+")");
	}

	public void printContact(Contact contact) { 
		contact.printInfo();
	}

	public void printAllContact(){ 
		for(int i=0; i<n; i++) {
			member[i].printInfo();
			System.out.println("--------------------");
		}
	}

	public void searchContact(String name) {
		
		for (i=0; i<n;) {
			if (name.contentEquals(member[i].getName())) {
				System.out.println("일치하는 정보가 존재합니다.");
				member[i].printInfo();
				break;
			} 
			System.out.println("일치하는 정보가 존재하지 않습니다.");
			break;
		}
	}	

	public void deleteContact(String name) {
		
		for (i=0; i<n; i++) {
			if (name.contentEquals(member[i].getName())) {
				break;
			}
		}	
		for (int target=i; target<(n-1); target++) {
			member[target]=member[target+1];
		}
		n--;
	}	

	public void editContact(String name, Contact newContact) {
		
		for (i=0; i<n; i++) {
			if (name.contentEquals(member[i].getName())) {
				break;
			}
		}	
		System.out.println("정보를 수정하시오.\n1. 회사\n2. 거래처");
		int num = in.nextInt();
		if (num >=1 && num <= 2) {
			switch (num) {
			case 1:
				addContact(inputContactData(1));
				member[i] = newContact;
				break;
			case 2:
				addContact(inputContactData(2));
				member[i] = newContact;
				break;
			}
		} else {
			System.out.println("메뉴 내의 숫자를 입력하시오.");
		}
		
		for (int target=i; target<(n-1); target++) {		
		member[target]=member[target+1];
		}
		n--;
		
	}
}