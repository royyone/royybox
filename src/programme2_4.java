import java.util.Scanner;
public class programme2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double pi = 3.14159;
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * pi;
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		input.close();
	}
}
