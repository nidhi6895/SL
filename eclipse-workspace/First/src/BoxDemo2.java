
public class BoxDemo2 {

	
	public static void main(String[] args) {
		
	double volume ;
		 
	BoxConstructor b1 = new BoxConstructor(10,5 ,3); // constructor for a class is called automatically when object is created 
	volume = b1.volume();
	System.out.println("Volume is " + volume);

	BoxConstructor b2 = new BoxConstructor(12,4,6);
	volume = b2.volume(); // volume of object b2
	System.out.println("Volume is " + volume);
	    

	    
	}
}