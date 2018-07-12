package AppleFactory;

public class AppleStore {
    
	public static Apple getApple (String color) {
		if(color.equals("yellow")) {
			return new YellowApple();
		}
		else {
			return new GreenApple();
		}
	}
}
