package algstudent.s1;

public class Vector4 {
	
	static double nTimes = 100;

	public static void main(String args[]) {
		long startingN = 10;
		
		
		while(startingN <= 430467210) {
			
			long avgTime = 0;
			
			for(int i = 1; i< nTimes; i++) {
				avgTime += calculateMax(""+startingN);
			}
			
			System.out.println("N: " + startingN + " Avg Time: " + avgTime);
			startingN *= 3;
			
		}
	}
	
	
	private static long calculateSum(String str) {
		int n = Integer.parseInt(str);
		int[] v = new int[n];
		long startingTime = System.currentTimeMillis();
		Vector1.sum(v);
		long elapsedTime = System.currentTimeMillis() - startingTime;
		
		return elapsedTime;
	}
	
	private static long calculateFillIn(String str) {
		int n = Integer.parseInt(str);
		int[] v = new int[n];
		long startingTime = System.currentTimeMillis();
		
		Vector1.fillIn(v);
		
		long elapsedTime = System.currentTimeMillis() - startingTime;
		
		return elapsedTime;
	}
	
	private static long calculateMax(String str) {
		int n = Integer.parseInt(str);
		int[] v = new int[n];
		
		
		
		long startingTime = System.currentTimeMillis();
		int[] m = new int[2];
		Vector1.maximum(v, m);
		long elapsedTime = System.currentTimeMillis() - startingTime;
		
		return elapsedTime;
	}

}
