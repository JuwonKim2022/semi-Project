package project03;

public class CompanyContact extends Contact  {

	String companyName;
	String companyDivision;
	String companyPosition;
	
	public CompanyContact() {}
	
	public CompanyContact(String name, String mobile, String eMail, String address, String birth, String group, String companyName, String companyDivision, String companyPosition){
		super(name, mobile, eMail, address, birth, group);
		this.companyName=companyName;
		this.companyDivision=companyDivision;
		this.companyPosition=companyPosition;
	}
	
	@Override
	public void printInfo () {
		super.printInfo();
		System.out.println("회사이름 : "+companyName+"\n부서이름 : "+companyDivision+"\n직급 : "+companyPosition);
		return;
	}
}