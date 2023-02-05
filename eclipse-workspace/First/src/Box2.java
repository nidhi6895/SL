
public class Box2 {

	double width;
	double hieght;
	double depth;
	
	public void setDimension(double w, double h, double d) {
		
     width=w;
     hieght=h;
     depth=d;

	}
	public double volume() {
		
	   return width*hieght*depth;
	   
		}
	}

