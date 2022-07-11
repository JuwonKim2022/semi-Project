package project06;

public abstract class Contact implements ShowData {
	
	private String name;
	private String mobile;
	private String eMail;
	private String address;
	private String birth;
	private String group;
	
	public Contact() {}
	
	public Contact(String name, String mobile, String eMail, String address, String birth, String group){
		this.name=name;
		this.mobile=mobile;
		this.eMail=eMail;
		this.address=address;
		this.birth=birth;
		this.group=group;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public void printInfo () {
		System.out.println( "이름: "+name+"\n전화번호: "+mobile+"\n이메일: "+eMail+"\n주소: "+address+"\n생일: "+birth+"\n그룹: "+group);
		return;
	}

	public abstract void showData();
	
}

