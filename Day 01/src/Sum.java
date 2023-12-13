public class Sum {
    public static void main(String[] args) {
        System.out.println("Sum : "+(args[0]+args[1]));
        //it will concaatinate two args so output will be concatinated 
        //eg i/p 12 34 o/p 1234
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        System.out.println("Sum : "+(num1+num2));
        //Here it will give the addition as we are using parseInt method of Integer

        //Sum of double
        double num3 =Double.parseDouble(args[2]);
        double num4 =Double.parseDouble(args[3]);
        System.out.println("Sum : "+(num3+num4));


    }
}
