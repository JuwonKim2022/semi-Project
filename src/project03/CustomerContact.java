package project03;

public class CustomerContact extends Contact {

	String accountName;
	String product;
	String accountPosition;
	
	public CustomerContact() {}
	
	public CustomerContact(String name, String mobile, String eMail, String address, String birth, String group, String accountName, String product, String accountPosition){
		super(name, mobile, eMail, address, birth, group);
		this.accountName=accountName;
		this.product=product;
		this.accountPosition=accountPosition;
	}
	
	@Override
	public void printInfo () {
		super.printInfo();
		System.out.println("거래처이름 : "+accountName+"\n품목이름 : "+product+"\n직급 : "+accountPosition);
		return;
	}
}