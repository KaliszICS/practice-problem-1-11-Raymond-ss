import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double var1 = input.nextDouble();
		System.out.println(Math.abs(var1));

	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double var1 = input.nextDouble();		
		System.out.print("Input another number: ");
		double var2 = input.nextDouble();
		System.out.println(Math.floor((var1/var2)));
		System.out.println(Math.ceil((var1/var2)));
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double var1 = input.nextDouble();
		var1 = Math.sqrt(var1);
		System.out.println(Math.round(var1));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double var1 = input.nextDouble();		
		System.out.print("Input another number: ");
		double var2 = input.nextDouble();
		System.out.println(Math.pow(var1,var2));

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double var1 = input.nextDouble();		
		System.out.print("Input another number: ");
		double var2 = input.nextDouble();
		System.out.print("Input one more number: ");
		double var3 = input.nextDouble();
		System.out.println(Math.max(var2,var3));
		System.out.println(Math.min(var2,var3));

	}

}
