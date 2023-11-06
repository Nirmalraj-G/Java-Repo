package FullStack;

public class BankDetails {

	public static void main(String args[]) {
		BankAdmin myObja = new BankAdmin();
		BankAdmin myObj = new BankAdmin();
		myObj.setPassword(123456);
		myObj.setAcno(344457688);
		System.out.println("Bank Name: " + myObj.bname);
		System.out.println("Account holder Name: " + myObja.name);
		System.out.println("Age: " + myObja.age);
		System.out.println("Gender: " + myObj.gender);
		System.out.println("Ph.No: " + myObja.ph);
		System.out.println("Account number: " + myObj.getAcno());
		System.out.println("IFS Code: " + myObja.ifs);
		System.out.println("Password: " + myObj.getPassword());
		System.out.println("Branch: " + myObj.adds);
		System.out.println("Addres: " + myObja.branch);
	}
}
