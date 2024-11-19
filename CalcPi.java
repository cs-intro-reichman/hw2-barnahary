// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		int one = 1;
		double zero = 0.0;
		for (int i = 0; i < n; i++) {
			int b = 2 * i + 1;
			zero += one * (1.0 / b);
			one = -one;
		}
		zero *= 4;
		double pie = Math.PI;
		System.out.println("pi according to java: " + pie);
		System.out.println("pi, approximated: " + zero);
		
	}
}
