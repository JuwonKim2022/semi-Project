package project01;

public class ContactMain {

	public static void main(String[] args) {

		Contact member = new Contact("최윤호", "010-0000-0000", "choi@gmail.com", "서울", "2000-05-05", "친구");
		Contact.printInfo(member);
		System.out.println("--------------------");
		System.out.println("그룹 정보 변경");
		System.out.println("--------------------");
		member.setGroup("가족");

		Contact.printInfo(member);

	}
}