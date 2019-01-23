public class modMath{
	public static void main(String[] args){
		int a = Math.abs(10);
		int b = Math.abs(-20);
		double c = Math.ceil(7.342);
		double f = Math.floor(7.343);
		int mx = Math.max(25, 21);
		int mn = Math.min(5, -12);
		double p = Math.pow(81, 1/2);
		double s = Math.sqrt(81);
		double sine = Math.sin(90);
		double cosine = Math.cos(0);

		System.out.println("Absolute (a)= " + a);
		System.out.println("Absolute (b)= " + b);
		System.out.println("Ceil = " + c);
		System.out.println("Floor = " + f);
		System.out.println("Max = " + mx);
		System.out.println("Min = " + mn);
		System.out.println("Power (81, 1/2)= " + p);
		System.out.println("Square root (81)= " + s);
		System.out.println("Sin (90) = " + sine);
		System.out.println("Cos (0) = " + cosine);
	}
}
