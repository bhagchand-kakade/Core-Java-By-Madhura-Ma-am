
public class Box {

	private double width, Height, depth;

	// Parameterized constructore
	Box(double w, double H, double depth) {
		width = w;
		Height = H;
		this.depth = depth;
		// this is current object reference
		// used to un hide instance var from method local vat
	}

	// Add overloaded parameterized constructor to inti cube
	Box(double side) {
		// width=Height=depth=side;//not good practice as it is not following oops
		this(side, side, side);// constructor chaining

	}
	/*
	 * Box(){
	 * 
	 * }
	 */

	// method to return Dimensions
	String getBoxDim() {

		return "Box Dimentions " + this.width + " " + Height + " " + this.depth;
	}

	// method to return volume
	double computeVolume() {
		return width * Height * depth;
	}

	// Add method to test equality of two boxes
	boolean isEqual(Box anotherBox) {
		return this.width == anotherBox.width && this.Height == anotherBox.Height && this.depth == anotherBox.depth;
	}
	//Box createNewBox=new Box(sc.next.Double,.....)
	//add new method to return new box with offset dimensions
	
	Box creatNewBox(double wOff,double hOff,double dOff) {
		Box newBox = new Box(this.width+wOff, Height+hOff, depth+dOff);
		return newBox;
	}
	
}
