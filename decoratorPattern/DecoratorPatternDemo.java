package designPatterns.decoratorPattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		// Original circle.
		Shape circle = new Circle();
		
		// Decorated circle.
		Shape redBorderCircle = new RedBorderShapeDecorator(new Circle());
		Shape blueTextureCircle = new BlueTextureShapeDecorator(new Circle());
		
		circle.draw(); // Prints White circle.
		System.out.println();
		
		redBorderCircle.draw(); // Prints White circle with red border.
		System.out.println();
		
		blueTextureCircle.draw(); // Prints White circle with blue texture.
	}
}
