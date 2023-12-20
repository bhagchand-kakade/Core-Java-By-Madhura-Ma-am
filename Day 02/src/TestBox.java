import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Box Dimention : W H D ");
	//	Box b; // b : ref type var stores the address, method local variable stored on stack
		// System.out.println(b); javac error b1 is not initialize
		Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		//Display box dimention
		System.out.println(b1.getBoxDim());
		//Display volume of box
		System.out.println(b1.computeVolume());
		Box b2 =b1;//copy of reference
		System.out.println(b2.getBoxDim());
		b1=b2=null; //1 obj is marked for GC
		//System.out.println(b1.getBoxDim()); //Nullpointer Exception
		System.out.println("Enter side of cube ");
		Box cube= new Box(sc.nextDouble());
		System.out.println("Cube dimentions are: "+cube.getBoxDim());
		System.out.println("Volume of cube: "+cube.computeVolume());
		System.out.println("continued...");
		sc.close();

	}

}
