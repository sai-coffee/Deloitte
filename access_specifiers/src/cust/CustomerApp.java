package cust;

public class CustomerApp {
	
	public static void main(String[] args) {
		CustDetails C1 = new CustDetails(100, "sai", "2nd street", 5000);
		CustDetails C2 = new CustDetails(150, "Ray", "8th street", 6000);
		CustDetails C3 = new CustDetails(2000, "Rai", "9th street", 7000);
		CustDetails C4=C3;
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
		C1.setCustomerAddress("10th street");
		System.out.println(C2.getBillAmount());
		System.out.println(C1.getCustomerAddress());
		
		//System.out.println(C1.equals(C2));
		//System.out.println(C4.equals(C3));
	
		
	}

}
