import java.util.Scanner;

public class Lab01 {


    // function that takes an array and computes the highest altitude
    public int highestAltitude(int[] gain) {

        // create total to collect altitude points of trip
        int total = 0;                                // constant

        // create an empty array equal to size of array gain parameter
        // this will be the array of the bike trip
        int [] altitudes = new int[gain.length+1];    // n+1   ,space is allocated, +1 cause using length +1

        // set first index of altitude array to 0, first point of all bike trips start at 0
        altitudes[0] = 0;                             // constant

        // create for loop to track altitudes and add to new array
        for (int i=0; i < gain.length; i++) {         // search through array, n+1
            total += gain[i];                         // constant
            altitudes[i+1] = total;                   // constant
        }

        // find the max altitude, start at the 0 index
        int maxAltitude = altitudes[0];               //  constant

        for (int i=0; i < altitudes.length; i++) {    // search through array, n+1
            if (altitudes[i] > maxAltitude) {         // constant
                maxAltitude = altitudes[i];           // constant
            }
        }

        // cover the extreme case if maxAltitude is less than or equal to 0
        if (maxAltitude <= 0) {                      // if statement, constant
            return 0;                                // constant
        }
        else {
            return maxAltitude;                      // constant
        }

    }

    // 3+n
    // drop constants drop for a space of O(n)

    public static void main(String args[]) {

        Lab01 l = new Lab01();
        // example 1 from assignment handout
        int[] trip1 = {-5, 1, 5, 0 ,-7};
        int trip1_max = l.highestAltitude(trip1);
        System.out.println("The corresponding altitudes are: " );
        System.out.println("The highest Altitude for the 1st bike trip is: " + trip1_max);

        // example 2 from assignment handout
        int[] trip2 = {-4, -3, -2, -1, 4, 3, 2};
        int trip2_max = l.highestAltitude(trip2);
        System.out.println("The highest Altitude for the 2nd bike trip is: " + trip2_max);

        // create user input to create a new array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int userGain[] = new int[size];

        // create user input to add altitudes to new array
        System.out.println("Enter the altitudes of your trip, type a number, then press enter: ");
        for (int i=0;i<userGain.length;i++) {
            userGain[i] = scanner.nextInt();
        }

        // apply userGain to highestAltitude function
        int userMax = l.highestAltitude(userGain);

        // print results of userGain highest Altitude
        System.out.println("The highest Altitude in you bike trip is: " + userMax);


    }

}
