package AppleFactory;

public class FruitPerson {
   private Apple apple;
	
	public FruitPerson(Apple apple) {
		this.apple=apple;
	}
	
	public void eatApple() {
		apple.eat();
	}
	
	
	public void drinkApple() {
		apple.drink();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FruitPerson f=new FruitPerson(AppleStore.getApple("y"));
         f.eatApple();
         f.drinkApple();
	}

}
