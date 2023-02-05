
public class FlowControl {

	public static void main(String args[]) {
		int a= 40, b= 75,c= 15;
		if(a>=b && a>=c)
		{
			System.out.println("Largest of 3 number:" + a);
		}
		if(b>=a && b>=c)
		{
			System.out.println("Largest of 3 number:" + b);
		}
		if(c>=b && c>=a)
		{
			System.out.println("Largest of 3 number:" + c);
		}
	}
}
