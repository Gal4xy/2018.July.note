package test;

import OrangeObserve.Orange;
import applicationEvent.OrangeEvent;
import applicationEvent.OrangeEventPublisher;
import iOC.showItem;
import OrangeObserve.PriceObserver;
import java.util.Observable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("FruitBean.xml");
		OrangeEventPublisher oep= ctx.getBean("publisher",OrangeEventPublisher.class);
		showItem s=ctx.getBean("show",showItem.class);
		s.display();
		oep.publishEvent();
		
	}

}
