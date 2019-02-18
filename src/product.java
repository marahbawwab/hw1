
public class product {


	private String Name;
	private int quantity;
	private double totalp;
 
	public product(String n, int q, double price) {
		this.Name = n;
		this.quantity = q;
		this.totalp =  price;
	}
 
	public String getname() {
		return Name;
	}
 
	public void setname(String productName) {
		this.Name = productName;
	}
 
	public int getQuantity() {
		return quantity;
	}
 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	public double getPrice() {
		return totalp;
	}
 
	public void setPrice(double totalPrice) {
		this.totalp = totalPrice;
	}
}
