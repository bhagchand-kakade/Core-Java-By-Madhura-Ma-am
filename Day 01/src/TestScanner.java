import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		//create a scanner object
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter emp Id, salary, Name, Permanent status");
		System.out.printf("Empt Id %d, Salary %.2f, Name %s, Is permenent %b %n", sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextBoolean());
		sc.close();

	}

}
