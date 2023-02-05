
public class OverloadingDemo {
	
	void hello() {
	System.out.println("hello with no parameters");
}
	void hello(int a) {
	System.out.println("hello with 1 parameters of type integer"+ a);
}	void hello(int a, int b) {
	System.out.println("hello with 2 parameters of type integer"+ a+","+b);
}	
}
