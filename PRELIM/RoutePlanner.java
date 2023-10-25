import java.util.Scanner;

public class RoutePlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MOALBOAL ROUTE PLANNER");

        int speed = getInputInt(input, "How fast are you going? (km/hr): ");
        boolean barili = getInputYesNo(input, "Is Barili blocked? (YES or NO): ");
        boolean dumanjug = barili && getInputYesNo(input, "Is Dumanjug blocked? (YES or NO): ");

        int selectedRoute = determineRoute(barili, dumanjug);

        routePlanner(speed, selectedRoute);
    }

    public static int getInputInt(Scanner input, String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                value = input.nextInt();
                break;
            } else {
                System.out.println("Please enter a valid integer.");
                input.next();
            }
        }

        return value;
    }

    public static boolean getInputYesNo(Scanner input, String prompt) {
        boolean choice;

        while (true) {
            System.out.print(prompt);
            String response = input.next().toLowerCase();

            if (response.equalsIgnoreCase("yes")) {
                choice = true;
                break;
            } else if (response.equalsIgnoreCase("no")) {
                choice = false;
                break;
            } else {
                System.out.println("Please enter 'yes' or 'no'.");
            }
        }

        return choice;
    }

    public static int determineRoute(boolean barili, boolean dumanjug) {
        if (barili) {
            return dumanjug ? 3 : 2;
        } else {
            return 1;
        }
    }

    public static void routePlanner(int speed, int selectedRoute) {
        double interval;
        String routeDescription;

        switch (selectedRoute) {
            case 3:
                interval = 92.2;
                routeDescription = "\nMinglanilla - Route 1 \nSan Fernando - Route 2 \nCarcar - Route 3 \nSibonga - Route 4.2"
                        + "\nArgao - Route 5 \nRonda - Route 5.1 \nAlcantara - Route 5.2";
                break;
            case 2:
                interval = 93.9;
                routeDescription = "\nMinglanilla - Route 1 \nSan Fernando - Route 2 \nCarcar - Route 3 \nSibonga - Route 4.2"
                        + "\nDumanjug - Route 4.2.1 \nAlcantara - Route 4.2.2";
                break;
            default:
                interval = 84.9;
                routeDescription = "\nMinglanilla - Route 1 \nSan Fernando - Route 2 \nCarcar - Route 3 \nBarili - Route 4.1"
                        + "\nDumanjug - Route 4.1.1 \nAlcantara - Route 4.1.2";
        }

        System.out.println("\nRecommended Route: " + "\nCebu City (South Bus Terminal)" + routeDescription + "\nMoalboal (End)\n");
        
        System.out.println("Vehicle Speed: " + speed + " km/hr");
        System.out.println("Distance: " + interval + " km");
        int hr = (int) (interval / speed);
        int minutes = (int) ((interval / speed * 60) % 60);
        System.out.println("Estimated Time of Arrival (ETA): " + hr + " Hour(s) " + minutes + " Minute(s)");
    }
}
