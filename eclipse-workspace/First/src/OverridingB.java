
public class OverridingB extends OverriddingA {
	int k;
	OverridingB(int a, int b,int c){
		
	super(a,b);
	k=c;
	
	}
	void show() {
		super.show();
		System.out.println("k: "+k);
		
	}
}
