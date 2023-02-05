
public class TwoDimArray {

	public static void main(String args[]) {
		int[][] twoDarray;
		twoDarray = new int[4][4];
		int k=0;
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				twoDarray[i][j]=k;
			
				System.out.println("Value of towDarray["+i+"]"+"["+j+"]"+"is"+twoDarray[i][j]);
				k++;
			}
		}
	}
}
