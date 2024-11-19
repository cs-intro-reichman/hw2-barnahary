// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= N; i++) {
			int steps = 1;
			int t = i;
			if (i == 1) {
				System.out.print(" 1 4 2 1");
				System.out.println(" (4)");
				continue;
			}
			System.out.print(" " + t);
			
			while ( t != 1 ) {
		if (t % 2 == 0) { 
			t = t / 2;
		} else {
			t = (t *  3) + 1;
		}
		System.out.print(" " + t);
		steps++;
	}
	System.out.println( " ("+ steps +")");
		}	
	}
	}


