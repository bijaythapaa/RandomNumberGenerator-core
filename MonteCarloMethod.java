package simulation;

import java.util.Scanner;

public class MonteCarloMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of data points: ");
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		double d = 0.0;
		int count = 0;
		double pi=0.0;
		System.out.println("Enter the data values:");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		System.out.println("The entered values are:");
		for (int i = 0; i < n; i++) {
			System.out.println("(" + x[i] + "," + y[i] + ")");
		}

		for (int i = 0; i < n; i++) {
			d = ((x[i] * x[i]) + (y[i] * y[i]));
			if (d < 1) {
				count=+count;
			}
		}
		
		pi=(4*count)/n;
		System.out.println("The value of PI is: "+pi);
		sc.close();
	}

}
