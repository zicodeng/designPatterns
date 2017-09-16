package designPatterns.decoratorPattern;

// RedBorderShapeDecorator is a concrete class that extends
// abstract class ShapeDecorator.
// This class adds a red border to any shape.
public class RedBorderShapeDecorator extends ShapeDecorator {

	public RedBorderShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder();
	}
	
	public void setRedBorder() {
		System.out.print(" with red border");
	}
}
