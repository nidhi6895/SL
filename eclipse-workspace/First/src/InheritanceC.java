
public class InheritanceC extends InheritanceA{

	int i;
	InheritanceC(int a,int b){

		super.i=a;//parent i
		i=b; //child i
	}
	public void show() {
		
		System.out.println("Value of parent i : "+ super.i );
		System.out.println("Value of child i : "+ i );
		
	}
}
