package example.designPatterns.decoratorPattern;

// This class adds a blue texture to a any shape.
public class BlueTextureShapeDecorator extends ShapeDecorator {

	public BlueTextureShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setBlueTexture();
	}
	
	public void setBlueTexture() {
		System.out.print(" with blue texture");
	}
}
