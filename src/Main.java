import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Opgave 5.1
        /**
         * Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number");
        int number = scan.nextInt();
         if(number >= 0){
             System.out.println("This number is positive");
         }
         else System.out.println("This number is negative");
         **/
         //opgave 7
        /**Scanner counter = new Scanner(System.in);
        System.out.println("Please insert an array of numbers");
        double a = readDouble();
        double b = readDouble();
        double c = readDouble();
        if (a < b && b < c){
            System.out.println("The array is in increasing order");
        }
        else if (a > b && b > c){
            System.out.println("The array is in decreasing order");
        }
        else {
            System.out.println("The array is in neither increasing or decreasing");
        }
    } **/



        }
    private static String readLine() {
        return new Scanner(System.in).nextLine();
    }

    private static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    private static double readDouble() {
        return new Scanner(System.in).nextDouble();
    }

}