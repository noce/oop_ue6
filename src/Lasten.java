
public class Lasten implements Befoerderung{

	private int sizeOfLoadingSpace;
	
	public Lasten(int sizeOfLoadingSpace){
		this.sizeOfLoadingSpace = sizeOfLoadingSpace;
	}
	
	public String getType(){
		return "Lasten";
	}
	
	public int getSize(){
		return sizeOfLoadingSpace;
	}
}
