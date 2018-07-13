package OrangeObserve;

import java.util.Observable;

public class Orange extends Observable {
    
  private String price="";
  
  public void setPrice(String price) {
	  this.price=price;
	  notifyObservers(price);
  }
	
}
