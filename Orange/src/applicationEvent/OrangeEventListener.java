package applicationEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class OrangeEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		// TODO Auto-generated method stub
		if(evt instanceof OrangeEvent) {
			OrangeEvent oe=(OrangeEvent)evt;
			oe.setPrice("239");
			System.out.println("Orange price is "+oe.getPrice());
		}
	}

	
	
}
