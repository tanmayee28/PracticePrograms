package Vendors;

import java.util.ArrayList;

public class Amazon extends Vendor{

	public Amazon(String vname, ArrayList<Product> list) {
		super(vname, list);
	}

	@Override
	public void getPurchase(Customer customer) {
	}
	@Override
	public String toString() {
		return "Amazon [vname=" + vname + ", list=" + list + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
