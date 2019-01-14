package Vendors;

import java.util.ArrayList;

public class FlipCart extends Vendor{

	public FlipCart(String vname, ArrayList<Product> list) {
		super(vname, list);
	}

	@Override
	public void getPurchase(Customer customer) {
		ArrayList<Product>cList=customer.reqProducts;
		int i=0;
		for(Product vp:list)
		{
			Product cp=cList.get(i);
			if(vp==cp)
			{
				/*double vprice=cp.pPrice-()
				int av=vp.pAvail-cp.pAvail;
				cp.setpAvail(av);*/
			}
			i++;
		}
		
	}
	@Override
	public String toString() {
		return "FlipCart [vname=" + vname + ", list=" + list + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
