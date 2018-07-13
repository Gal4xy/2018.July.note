package iOC;
import AppleFactory.Apple;


public class FruitPerson implements Person{

	private Apple apple;
	
	public void setApple(Apple apple) {
		this.apple=apple;
	}
	
	public void eatFruit() {
		apple.eat();
	}
	
	
}
