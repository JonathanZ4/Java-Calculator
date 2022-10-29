import java.util.*;
public class JavaCalculator {


    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        int num3;
        int num4;
        int counter;
        int num5;
        int num6;
        int product;
        int num7;
        int num8;
        int division;
        int num9;
        int squared;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be added : \n");
        num1 = sc.nextInt();
        System.out.println("Enter the next number you would like to add it by : \n");
        num2 = sc.nextInt();
        sum = add(num1, num2);
        System.out.println("Sum : " + sum);

        System.out.println("Enter a number to subtract\n");
        num3 = sc.nextInt();
        System.out.println("Now enter a number to subtract it by\n");
        num4 = sc.nextInt();
        counter = subtract(num3, num4);
        System.out.println("Answer is : " + counter);

        System.out.println("Enter a number to multiply\n");
        num5 = sc.nextInt();
        System.out.println("Enter a number to multiply it by");
        num6 = sc.nextInt();
        product = multiply(num5, num6);
        System.out.println("Answer is : " + product);

        System.out.println("Enter a number to divide\n");
        num7 = sc.nextInt();
        System.out.println("Enter a number to divide it by");
        num8 = sc.nextInt();
        division = divide(num7, num8);
        System.out.println("Answer is : " + division);

        System.out.println("Enter a number to square \n");
        num9 = sc.nextInt();
        squared = square(num9);
        System.out.println("Answer is : " + squared);

    }
        public static int add(int num1, int num2) {
            int sum = num1 + num2;
            return sum;
        }
    public static int subtract(int num3, int num4) {
        int counter = num3 - num4;
        return counter;
    }
    public static int multiply(int num5, int num6) {
        int product = num5 * num6;
        return product;
    }
    public static int divide(int num7, int num8) {
        int division = num7 / num8;
        return division;
    }
    public static int square(int num9) {
         int squared = num9 * num9;
         return squared;

    }



}