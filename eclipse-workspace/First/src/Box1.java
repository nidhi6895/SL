
public class Box1 {
double height;
double width;
double length ;
public void volume() {
	System.out.println("Volume="+height*width*length);
}
}
class BoxDemo{
	public static void main(String args[]) {
		
		Box1 b1;// declare reference to  an object
		b1= new Box1();// Allocate memory to b1
	//Box1 b1 =new  Box1();
	
	b1.height=20;
	b1.width=10;
	b1.length=5;
	b1.volume();
 
 Box1 b2 =new Box1();
 b2.height=1;
 b2.width=1;
 b2.length=1;
	b2.volume();
	Box1 b3;
	b3=b2;
	b2=null;
	
	}
}