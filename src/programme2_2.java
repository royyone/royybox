import java.util.Scanner;
public class programme2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble() ;
		double area = radius *radius * 3.14159;
		System.out.println("The area for the circle of radius "+radius + " is " +area );
		input.close();
	}
}
// Scanner input = new Scanner(System.in);
//import java.util.Scanner;
//Scanner input = new Scanner(System.in);
