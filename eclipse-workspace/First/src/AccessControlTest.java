
public class AccessControlTest {
	public static void main(String args[]) {
		AccessControlDemo obj1= new  AccessControlDemo();
		obj1.a=10;
		obj1.b=20;
		obj1.setC(30);
		System.out.println("value of a : "+ obj1.a);
		System.out.println("value of b : "+ obj1.b);
		System.out.println("value of c : "+ obj1.getC());
				
		
	}

}
