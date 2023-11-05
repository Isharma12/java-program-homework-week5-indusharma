package homework_week_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10 {
    public static void main(String[] args) {

        char result;
        // London zone 1 Station list

        System.out.println("London Zone 1 Station : ");
        System.out.println("Bond Street, Covent Garden, Edgeware road, Green park, Holborn district, Kensignton, London bridge, Oxford circus, Paddington, Westminster ");
        HashMap<String, String> zone = new HashMap<>();
        zone.put("Bond Street", "Jubilee");
        zone.put("Covent Garden", "Piccadily");
        zone.put("Edgeware road", "Circle,Hammersmith & City");
        zone.put("Green Park", "Piccadily, Victoria");
        zone.put("Holborn District", "Central, Piccadily");
        zone.put("Kensington", "Circle, District");
        zone.put("Leicester Square", "Piccadily");
        zone.put("Oxford circus", "Bakerloo, Central");
        zone.put("Victoria", "Central, Circle, District");
        zone.put("Westminster", "Circle, District");

        // do while loop if user wants to continue
        do {
            // Scanner declaration
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the station name from the list: ");
            // user can input station name and storing it
            String stationName = scanner.nextLine();

            // for eachloop applied for the find the station

            for (String str : zone.keySet()) {
                if (stationName.equalsIgnoreCase(str)) {
                    System.out.println("Tube Lines : " + zone.get(str));

                }
            }
            System.out.println(" ");
            System.out.println("Would you like to check again? Y or N: ");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');

    }
}

