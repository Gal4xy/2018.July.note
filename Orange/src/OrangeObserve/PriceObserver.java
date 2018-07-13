package OrangeObserve;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
     public String nprice="";
	
	public void update(Observable o,Object value) {
		if(value instanceof String) {
			String price=(String) value;
			nprice=price;
			System.out.println("The new orange price is "+price);
		}
	}
}
