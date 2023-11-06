package FullStack;

public class BankAdmin {

	String name = "Nirmal";
	String branch = "Coimbatore";
	String bname = "SBI";
	int age = 23;
	String gender = "Male";
	long ifs = 123345;
	String adds = "Saravanampatti";
	long ph = 98765432;
	private long password;
	private long acno;
	
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public static void main(String args[]) {
		BankAdmin myObja = new BankAdmin();
		System.out.println(myObja.name);
	}
}
