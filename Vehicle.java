public class Vehicle{
	private int maxSpeed;
	private int wheels;
	private String color;
	private double fuelCapacity;
	public static int COUNT = 0; 	
	
	public Vehicle(int s, int w, String c, double f) {
		maxSpeed = s;
		wheels = w;
		color = c;
		fuelCapacity = f;
		COUNT++;
	}

	public void horn(){
		System.out.println("Beep!");
	}
	
	public void Specifications(){
		System.out.println("Max speed = " + maxSpeed + " m/s");
		System.out.println("Wheels = " + wheels);
		System.out.println("Color = " + color);
		System.out.println("Fuel capacity = " + fuelCapacity + 'L');
		return;
	}
}
