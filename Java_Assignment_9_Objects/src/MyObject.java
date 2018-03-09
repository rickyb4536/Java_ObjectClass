
public class MyObject {
	
	private long id;
	
	public MyObject(long id) {
		this.id = id;
	}
	
	//Override the equals method to compare two objects
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof MyObject){
			return (((MyObject) obj).id == this.id); 
		}
		return false;
	}
}
