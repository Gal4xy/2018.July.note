package iOC;

public class showItem {
   
	private String name;
	private String taste;
	private String kind;
	
	public showItem(String name,String taste,String kind) {
		this.name=name;
		this.taste=taste;
		this.kind=kind;
	}
	
	public void display() {
		System.out.println(name+" is "+kind+" is "+taste);
	}
	
}
