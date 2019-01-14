package Vendors;

public class Product {
	
	String pName;
	double pPrice;
	int pAvail;
	Vendor vendor;

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public Product(String pName, double pPrice, int pAvail, Vendor vendor) {
		super();
		this.pName = pName;
		this.pPrice = pPrice;
		this.pAvail = pAvail;
		this.vendor = vendor;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpAvail() {
		return pAvail;
	}
	public void setpAvail(int pAvail) {
		this.pAvail = pAvail;
	}
	
	public Vendor getVendor() {
		return vendor;
	}
	
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pPrice=" + pPrice + ", pAvail=" + pAvail + ", vendor=" + vendor + "]";
	}
	
	
	

}
