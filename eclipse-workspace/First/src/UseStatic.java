
public class UseStatic {
	static int a=1;
	static int b;
	
	public static void main(String args[]) {
		method01(5);
		
	}
	static void method01(int x) {
		System.out.println("Value of x= "+x);
		System.out.println("Value of a= "+a);
		System.out.println("Value of b= "+b);
	}
	static {
		b=a*2;
	}

}
