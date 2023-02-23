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
        months monthName = months.January;
        System.out.print("Enter your numberic month: ");
        if (in.hasNextDouble()) {
            numericMonth = in.nextDouble();
            
            switch ((int)numericMonth) {
                case 1: monthName = months.January; break;
                case 2: monthName = months.February; break;
                case 3: monthName = months.March; break;
                case 4: monthName = months.April; break;
                case 5: monthName = months.May; break;
                case 6: monthName = months.June; break;
                case 7: monthName = months.July; break;
                case 8: monthName = months.August; break;
                case 9: monthName = months.September; break;
                case 10: monthName = months.October; break;
                case 11: monthName = months.November; break;
                case 12: monthName = months.December; break;
                default: System.out.println("ERROR - That was not a valid month number!");
                    System.exit(2);
            }
            
        }
        else {
            System.out.println(in.next() + " is not a valid number.");
            System.exit(1);
        }
        
        switch (monthName){
            case January: System.out.println("It is January"); break;
            case February: System.out.println("It is February"); break;
            case March: System.out.println("It is March"); break;
            case April: System.out.println("It is April"); break;
            case May: System.out.println("It is May"); break;
            case June: System.out.println("It is June"); break;
            case July: System.out.println("It is July"); break;
            case August: System.out.println("It is August"); break;
            case September: System.out.println("It is September"); break;
            case October: System.out.println("It is October"); break;
            case November: System.out.println("It is November"); break;
            case December: System.out.println("It is December"); break;
        }
    }
}
