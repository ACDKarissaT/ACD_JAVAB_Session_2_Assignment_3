package assignment3;

public class Assignment3 {
	public static void main(String[] args) {
		int n = 5;
		int i, j;
		
		for (i = 0; i <= n/2; i++) {
			for (j = 0; j < n-i; j++) {
				if (j != 0) System.out.print("_");
				if (Math.abs(j - (n/2)) == (n-1 - i-n/2)) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
		for (i = 2; i > 0; i--) {
			for (j = 0; j <= n-i; j++) {
				if (j != 0) System.out.print("_");
				if (Math.abs(j - (n/2)) == (n- i-n/2)) {
					
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}
