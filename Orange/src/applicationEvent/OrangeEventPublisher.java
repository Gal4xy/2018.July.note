package applicationEvent;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class OrangeEventPublisher implements ApplicationContextAware {

	ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx=ctx;
	}

	public void publishEvent() {
        OrangeEvent oe=new OrangeEvent("test");		
		ctx.publishEvent(oe);
	}
	
	
}
