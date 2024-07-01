public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);

        double num3 = 4.4;
        double num4 = 5.5;
        double decimal = num3 + num4;
        System.out.println(decimal);

        System.out.println(num2 + num4);
        //variable type must be a double

        double num5= 20;
        int num6= 2;
        System.out.println(num5/num6);
        //needed to change larger number type to "double". result gives a decimal point.

        double num7 = 4.8;
        double num8 = 2.2;
        int result = (int)(num7/num8);
        System.out.println(result);
        //type casting double to int

        int x = 5;
        int y = 6;
        double q = (double)(y)/x;
        System.out.println(q);
        //casted only y to change to a double with parenthesis

        final int constant = 50;
        int fittyone = constant + 1;
        System.out.println(fittyone);
        //declaring a named constant and using it in calculation

        int coffee = 4;
        double cappuccino = 5.50;
        int espresso = 3;
        double subtotal = coffee * 3 + cappuccino * 4 + espresso * 2;
        System.out.println(subtotal);
        final double sales_tax = subtotal * 0.0875 ;
        double totalSale = subtotal + sales_tax ;
        System.out.println(totalSale);
    }


    static void sayHello(){
        System.out.println("Hi Jennifer!");
    }

}