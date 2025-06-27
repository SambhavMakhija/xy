import java.util.*;

public class AirlineSystem {

    static String[] flights = {"AI101", "AI202", "AI303", "AI404"};
    static double[] prices = {4500, 3200, 5500, 4000};
    static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Flights\n2. Book\n3. Status\n4. Prices\n5. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> showFlights();
                case 2 -> book(sc);
                case 3 -> seatStatus();
                case 4 -> comparePrices();
                case 5 -> { System.out.println("Exiting."); return; }
                default -> System.out.println("Invalid.");
            }
        }
    }

    static void showFlights() {
        for (int i = 0; i < flights.length; i++)
            System.out.println((i + 1) + ". " + flights[i] + " ₹" + prices[i]);
    }

    static void book(Scanner sc) {
        showFlights();
        System.out.print("Flight (1-" + flights.length + "): ");
        int f = sc.nextInt();

        if (f < 1 || f > flights.length) { System.out.println("Invalid."); return; }

        for (int i = 0; i < seats.length; i++)
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Available"));

        System.out.print("Seat (0-9): ");
        int s = sc.nextInt();

        if (s < 0 || s >= seats.length) { System.out.println("Invalid."); return; }

        if (seats[s]) System.out.println("Already booked.");
        else {
            seats[s] = true;
            System.out.println("Seat " + s + " booked on " + flights[f - 1]);
        }
    }

    static void seatStatus() {
        for (int i = 0; i < seats.length; i++)
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Available"));
    }

    static void comparePrices() {
        int min = 0, max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) min = i;
            if (prices[i] > prices[max]) max = i;
        }
        System.out.println("Cheapest: " + flights[min] + " ₹" + prices[min]);
        System.out.println("Costliest: " + flights[max] + " ₹" + prices[max]);
    }
}
