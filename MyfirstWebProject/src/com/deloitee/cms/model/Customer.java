package com.deloitee.cms.model;

import java.io.Serializable;

public class Customer implements Serializable
{


		private int customerId;
		public String customerName;
		private String customerAddress;
		private int BillAmount;
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
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
		public int getBillAmount() {
			return BillAmount;
		}
		public void setBillAmount(int billAmount) {
			BillAmount = billAmount;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + BillAmount;
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
			Customer other = (Customer) obj;
			if (BillAmount != other.BillAmount)
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
		public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			BillAmount = billAmount;
		}
		
		
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
					+ customerAddress + ", BillAmount=" + BillAmount + "]";
		}
		public Customer() {
			// TODO Auto-generated constructor stub
		}
		
	
	
	
	
	
}
