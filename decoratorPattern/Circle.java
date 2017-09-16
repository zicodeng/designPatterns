package designPatterns.decoratorPattern;

public class Circle implements Shape {
	// Empty constructor.
	public Circle() {}

	@Override
	public void draw() {
		// Prints out a white circle with no border by default.
		System.out.print("White circle");
	}
}
