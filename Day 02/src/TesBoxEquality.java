import java.util.Scanner;

public class TesBoxEquality {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first box Dimentions :");
		Box b1 =new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter second box Dimentions :");
		Box b2 =new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.isEqual(b2)?"SAME dimentions":"DIFFRENT dimentions");
		System.out.println("Enter Offset from the first Box: ");
		Box b3 =b1.creatNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(b1.getBoxDim());
		System.out.println(b3.getBoxDim());
		sc.close();

	}

}
