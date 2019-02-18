import java.util.ArrayList;
import java.util.List;

public class ShopCart {
	private List<product> products = new ArrayList<>();
  private double totalprice  ;
	public int getcount() {
		return products.size();
	}
public void add(product prod) {
		products.add(prod);
	}
public double gettotal() {
	// TODO Auto-generated method stub
	  for (int i = 0; i < products.size(); i++) 
      { 
         totalprice += products.get(i).getPrice();
      } 
	   return totalprice ;


}
	


		
		 
}
