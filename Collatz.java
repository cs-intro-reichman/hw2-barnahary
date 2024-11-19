// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		
		for (int i = 1; i <= N; i++) {
			int steps = 1;
			int t = i;
			
			if (mode.equals("v")) {
				if (i == 1) { 
					System.out.print("1 4 2 1");
					System.out.println(" (4)");
					continue;
				}
		
				System.out.print(i);
				
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
		} else if (mode.equals("c")){
			
		}
	}
	System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");	
}
}
	


