package simulation;

import java.util.Scanner;

public class LcmRandomGenerator {

	static double a;
	static double c;
	static double m;
	static double x0;
	static double x1;

	static void multiplicative(int n) {
		double[] x = new double[n + 1];
		c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		a = sc.nextDouble();
		System.out.println("Enter the value of m: ");
		m = sc.nextDouble();
		System.out.println("Enter the value of x0: ");
		x[0] = sc.nextDouble();
		for (int i = 1; i <= n; i++) {
			x[i] = (a * x[i - 1] + c) % m;
			x1 = x[i] / m;
			System.out.println(x1);
		}
		sc.close();
	}

	static void additive(int n) {
		double[] x = new double[n + 1];
		a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c: ");
		c = sc.nextDouble();
		System.out.println("Enter the value of m: ");
		m = sc.nextDouble();
		System.out.println("Enter the value of x0: ");
		x[0] = sc.nextDouble();
		for (int i = 1; i <= n; i++) {
			x[i] = (a * x[i - 1] + c) % m;
			x1 = x[i] / m;
			System.out.println(x1);
		}
		sc.close();
	}

	static void mixed(int n) {
		double[] x = new double[n + 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		a = sc.nextDouble();
		System.out.println("Enter the value of c: ");
		c = sc.nextDouble();
		System.out.println("Enter the value of m: ");
		m = sc.nextDouble();
		System.out.println("Enter the value of x0: ");
		x[0] = sc.nextDouble();
		for (int i = 1; i <= n; i++) {
			x[i] = (a * x[i - 1] + c) % m;
			x1 = x[i] / m;
			System.out.println(x1);
		}
		sc.close();
	}

	public static void main(String[] args) {

		System.out.println("Enter no of random no you want to generate: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the operation you want to perform: ");
		String choose = sc.next();
		switch (choose) {
		case "multiplicative":
			multiplicative(n);
			break;
		case "additive":
			additive(n);
			break;
		case "mixed":
			mixed(n);
			break;
		default:
			System.out.println("Wrong Input !!!");
			break;
		}
		sc.close();
	}

}
