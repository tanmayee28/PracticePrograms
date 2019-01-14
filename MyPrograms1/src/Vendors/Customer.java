package Vendors;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	String cName;
	double balance;
	ArrayList<Product>reqProducts=null;
	
	public Customer(String cName, double balance, ArrayList<Product>reqProducts) {
		super();
		this.cName = cName;
		this.balance = balance;
		this.reqProducts = reqProducts;
	}

	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public ArrayList<Product> getReqProducts() {
		return reqProducts;
	}
	public void setReqProducts(ArrayList<Product> reqProducts) {
		this.reqProducts = reqProducts;
	}
	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", balance=" + balance + ", reqProducts=" + reqProducts + "]";
	}
	
	
	
	
	

}
