public class TestPrimTypes {

	public static void main(String[] args) {
		int data = 100;
		if(data==100)
			System.out.println("Yess");
		else
			System.out.println("No");
		System.out.println("Max Integer "+ Integer.MAX_VALUE);
		System.out.println("Min Integer "+ Integer.MIN_VALUE);
		
		//byte b1=128;  //error range is -128 to 127
		byte b1=10;
		byte b2=5;
		b1+=10;
		byte b3=(byte)(b1+b2); //type casting
		int i= b1;
		long l = 123456434;
		float f=l; //No javac error long---> float : auto promotion
		//f=123.456; double ---> float is not auto promotion
		double d = 12345.567f;
		//madhura10anturkar@gmail.com
		

	}

}