package Vendors;

import java.util.ArrayList;

public abstract class Vendor {
	
	public String vname;
	public ArrayList<Product>list=null;;
	public Vendor(String vname, ArrayList<Product> list) {
		super();
		this.vname = vname;
		this.list = list;
		
	}
	public abstract void getPurchase(Customer customer);
	@Override
	public String toString() {
		return "Vendor [vname=" + vname + ", list=" + list +  "]";
	}
	
	
}
