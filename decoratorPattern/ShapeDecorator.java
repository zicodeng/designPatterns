package example.designPatterns.decoratorPattern;

// ShapeDecorator is an abstract class, meaning it should never
// be instantiated, and expect a subclass to override it. 
public abstract class ShapeDecorator implements Shape {
	// protected only gives access to inherited classes.
	protected Shape decoratedShape;
	
	// Precondition: an object with type of Shape must be passed in.
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	// Draw with decorated shape's original draw method.
	public void draw() {
		decoratedShape.draw();
	}
}
