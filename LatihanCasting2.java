package pertemuanPertama;
import java.util.Scanner;
public class LatihanCasting2 {

	public static void main (String[] args) {
		
		Scanner s;
		int a;
		float b;
		String c;
		s = new Scanner(System.in);
		a = s.nextInt() ;
		b = (float) a;
		c = Integer.toString(a)+Float.toString(b);
		
		System.out.print(c);
		
	}
	
	
	
	
	
	
	
	
	
	
}
