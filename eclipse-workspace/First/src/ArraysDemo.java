
public class ArraysDemo {
	public static void main(String args[]) {
		// Array is a data structure which holds group of variables togeather
		//it's size is defined
		
	
	/*int month_day[];
	
	month_day= new int[5];
	month_day[0]= 0;
	month_day[1]=1;
	month_day[2]=2;
	month_day[3]=3;
	month_day[4]=4;
	

	int month_day[]= {0,1,2,3,4};
		for(int i=0; i<5;i++) {
			System.out.println(month_day[i]); 
}}*/
int num[]= {10,20,30,40,50};
float result=0;
for(int i=0;i<num.length;i++) {

System.out.println(result+"+"+num[i]);
result= result+num[i];
System.out.println("Sum:"+result);

}
System.out.println("Total sum value:"+result);
System.out.println("Average:"+ String.format("%.2f", result/num.length));
	}}
