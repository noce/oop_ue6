
public class Lasten implements Befoerderung{

	private int sizeOfLoadingSpace;
	
	public Lasten(int sizeOfLoadingSpace){
		this.sizeOfLoadingSpace = sizeOfLoadingSpace;
	}
	
	public String isType(){
		return "Lasten";
	}
	
	public int getSize(){
		return sizeOfLoadingSpace;
	}
}
