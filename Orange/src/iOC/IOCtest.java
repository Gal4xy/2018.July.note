package iOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCtest {

	
	public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("FruitBean.xml");//create the container
	Person p=ctx.getBean("fruitPerson", Person.class);
    p.eatFruit();
	
	}
	
}
