import java.util.Scanner;
/**
 * PlanetaryWeights takes in a user's weight and returns
 * what that user would weigh on the different planets in the
 * solar system. It uses the enumeration Planet.
 * 
 * @author Jake Sweger
 * @version 1.0
 */
public class MonthNames {
    public static void main(String[] args) {
        double numericMonth = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your numberic month: ");
        if (in.hasNextDouble()) {
            numericMonth = in.nextDouble();
            for (months p : months.values())
                System.out.println("Your weight on " + p + " is " +
                                    p.getWeight(numericMonth));
        }
        else {
            System.out.println(in.next() + " is not a valid number.");
        }
    }
}
