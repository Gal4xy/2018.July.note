package applicationEvent;

import org.springframework.context.ApplicationEvent;

public class OrangeEvent extends ApplicationEvent {
   private String price="no price";
   
	public OrangeEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price){
		this.price=price;
	}
}
