import java.util.Scanner;

public class MyMain {
    // Calculates the median of the three inputs
    public static int median(final int a, final int b, final int c) {
        
        int sum = a + b + c;
        return (sum - Math.max(a,Math.max(b,c)) - Math.min(a,Math.min(b,c)));
        

    }

    // Returns the input with the larger absolute value
    public static int magnitude(final int a, final int b) {
        
        if (Math.max (Math.abs(a), Math.abs(b)) == Math.abs(a)) {
            return a;
        }
        else{
            return b;
        }
        
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(final int a, final int b) {

        double x = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return (x);

    }

    public static void main(final String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        final Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
