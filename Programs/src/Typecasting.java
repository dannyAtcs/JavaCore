
public class Typecasting {

	public static void main(String[] args) {
		
		//widening typecasting 
		int a =65;
		long l =a;
		float f = l;
		
		System.out.println(a + " " + l + " " + f);
		
		//narrowing Typecasting
		long large = 123456567;
		float k = (float)large;
		int n = (int)k;
		char c = (char)a;
		System.out.println(large + " " + k + " " + n + " " + c);
		
	}
}
