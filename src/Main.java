import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getKey();
    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
    }

    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e){
            System.out.println("Error");
        } finally {
            System.out.println("System Works");
        }
    }

    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.print("Error. Try again ");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            }catch (Exception e1) {
                System.out.println("Fatal Error");
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }


}

