package cust;

public class CustDetails {

private int customerId;
private String customerName;
private String customerAddress;
private double billAmount;

public CustDetails()
{
	customerId=0;
	customerName="NA";
	customerAddress="NA";
	billAmount=0;
}



public CustDetails(int customerId, String customerName, String customerAddress, double billAmount) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.billAmount = billAmount;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(billAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
	result = prime * result + customerId;
	result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustDetails other = (CustDetails) obj;
	if (Double.doubleToLongBits(billAmount) != Double.doubleToLongBits(other.billAmount))
		return false;
	if (customerAddress == null) {
		if (other.customerAddress != null)
			return false;
	} else if (!customerAddress.equals(other.customerAddress))
		return false;
	if (customerId != other.customerId)
		return false;
	if (customerName == null) {
		if (other.customerName != null)
			return false;
	} else if (!customerName.equals(other.customerName))
		return false;
	return true;
}

@Override
public String toString() {
	return "CustDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", billAmount=" + billAmount + "]";
}



public String getCustomerName() {
	return customerName;
}



public void setCustomerName(String customerName) {
	this.customerName = customerName;
}



public String getCustomerAddress() {
	return customerAddress;
}



public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}



public double getBillAmount() {
	return billAmount;
}



public void setBillAmount(double billAmount) {
	this.billAmount = billAmount;
}



public int getCustomerId() {
	return customerId;
}

 




}
