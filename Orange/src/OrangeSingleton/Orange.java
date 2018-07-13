package OrangeSingleton;

//Singleton 

public class Orange {
    
	public static Orange instance;
	
	private Orange() {};
	
	public static Orange getInstance() {
		if(instance == null) {
			instance=new Orange();
		}
	      return instance;
	}
	
	public static void main(String[] args) {
		Orange o1=Orange.getInstance();
		Orange o2=Orange.getInstance();
		System.out.println(o1==o2);
				
		
		
	}
}
